package org.insset.client.pourcentage;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ResetButton;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import org.insset.client.message.dialogbox.DialogBoxInssetPresenter;
import org.insset.client.service.PourcentageService;
import org.insset.client.service.PourcentageServiceAsync;
import org.insset.shared.FieldVerifier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author talend
 */
public class PourcentagePresenter extends Composite {

    @UiField
    public ResetButton boutonClearN;
    @UiField
    public SubmitButton boutonNewValue;
    @UiField
    public ResetButton boutonClearP;
    @UiField
    public SubmitButton boutonPreValue;
    @UiField
    public TextBox valR;
    @UiField
    public TextBox valPc1;
    @UiField
    public TextBox valA;
    @UiField
    public TextBox valPc2;
    @UiField
    public Label errorLabelNewValue;
    @UiField
    public Label errorLabelPreValue;

   interface MainUiBinder extends UiBinder<HTMLPanel, PourcentagePresenter> {
    }

    private static MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);
    /**
     * Create a remote service proxy to talk to the server-side Greeting
     * service.
     */
    private final PourcentageServiceAsync service = GWT.create(PourcentageService.class);

    /**
     * Constructeur
     */
    public PourcentagePresenter() {
        initWidget(ourUiBinder.createAndBindUi(this));
        initHandler();
    }

    /**
     * Init des handler
     */
    private void initHandler() {
        boutonClearN.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                valR.setText("");
                valPc1.setText("");
                errorLabelNewValue.setText("");
            }
        });
        boutonNewValue.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                NewValue();
            }

        });
        boutonClearP.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                valA.setText("");
                valPc2.setText("");
                errorLabelPreValue.setText("");
            }
        });
        boutonPreValue.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                PreValue();
            }

        });
    }

    /**
     * call server
     */
    private void NewValue() {
        Integer value1 = null;
        try {
            value1 = Integer.parseInt(valR.getText());
        } catch (NumberFormatException e) {
            errorLabelNewValue.addStyleName("serverResponseLabelError");
            errorLabelNewValue.setText("Format incorect11");
            return;
        }
        Integer value2 = null;
        try {
            value2 = Integer.parseInt(valPc1.getText());
        } catch (NumberFormatException e) {
            errorLabelNewValue.addStyleName("serverResponseLabelError");
            errorLabelNewValue.setText("Format incorect21");
            return;
        }
        if (!FieldVerifier.isValidDecimal(value1)) {
            errorLabelNewValue.addStyleName("serverResponseLabelError");
            errorLabelNewValue.setText("Format incorect12");
            return;
        }
        if (!FieldVerifier.isValidPourcentage(value2)) {
            errorLabelNewValue.addStyleName("serverResponseLabelError");
            errorLabelNewValue.setText("Format incorect22");
            return;
        }
        service.NewValue(value1,value2, new AsyncCallback<Integer>() {
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
//                Window.alert(SERVER_ERROR);
            }

            public void onSuccess(Integer result) {
                errorLabelNewValue.setText(" ");
                new DialogBoxInssetPresenter("Remise", valR.getText(), String.valueOf(result));
            }
        });
    }

    /**
     * call server
     */
    private void PreValue() {
        Integer value1 = null;
        try {
            value1 = Integer.parseInt(valA.getText());
        } catch (NumberFormatException e) {
            errorLabelNewValue.addStyleName("serverResponseLabelError");
            errorLabelNewValue.setText("Format incorect");
            return;
        }
        Integer value2 = null;
        try {
            value2 = Integer.parseInt(valPc2.getText());
        } catch (NumberFormatException e) {
            errorLabelNewValue.addStyleName("serverResponseLabelError");
            errorLabelNewValue.setText("Format incorect");
            return;
        }
        if (!FieldVerifier.isValidDecimal(value1)) {
            errorLabelNewValue.addStyleName("serverResponseLabelError");
            errorLabelNewValue.setText("Format incorect");
            return;
        }
        if (!FieldVerifier.isValidPourcentage(value2)) {
            errorLabelNewValue.addStyleName("serverResponseLabelError");
            errorLabelNewValue.setText("Format incorect");
            return;
        }
        service.PreValue(value1,value2, new AsyncCallback<Integer>() {
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
//                Window.alert(SERVER_ERROR);
            }

            public void onSuccess(Integer result) {
                errorLabelNewValue.setText(" ");
                new DialogBoxInssetPresenter("Avant Remise", valR.getText(), String.valueOf(result));
            }
        });
    }


}
