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
            errorLabelNewValue.setText("Valeur incorect");
            return;
        }
        Integer value2 = null;
        try {
            value2 = Integer.parseInt(valPc1.getText());
        } catch (NumberFormatException e) {
            errorLabelNewValue.addStyleName("serverResponseLabelError");
            errorLabelNewValue.setText("Pourcentage incorrect");
            return;
        }
        if (!FieldVerifier.isValidDecimal(value1)) {
            errorLabelNewValue.addStyleName("serverResponseLabelError");
            errorLabelNewValue.setText("Valeur incorect (doit etre positive)");
            return;
        }
        if (!FieldVerifier.isValidPourcentage(value2)) {
            errorLabelNewValue.addStyleName("serverResponseLabelError");
            errorLabelNewValue.setText("Pourcentage incorect (doit etre compris entre -100 et 100");
            return;
        }
        service.NewValue(value1,value2, new AsyncCallback<Integer>() {
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
//                Window.alert(SERVER_ERROR);
            }

            public void onSuccess(Integer result) {
                errorLabelNewValue.setText(" ");
                String envoi;
                envoi = valR.getText() + " et " + valPc1.getText() + "%";
                new DialogBoxInssetPresenter("Remise", envoi , String.valueOf(result));
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
            errorLabelPreValue.addStyleName("serverResponseLabelError");
            errorLabelPreValue.setText("Valeur incorect");
            return;
        }
        Integer value2 = null;
        try {
            value2 = Integer.parseInt(valPc2.getText());
        } catch (NumberFormatException e) {
            errorLabelPreValue.addStyleName("serverResponseLabelError");
            errorLabelPreValue.setText("Pourcentage incorrect");
            return;
        }
        if (!FieldVerifier.isValidDecimal(value1)) {
            errorLabelPreValue.addStyleName("serverResponseLabelError");
            errorLabelPreValue.setText("Valeur incorect (doit etre positive)");
            return;
        }
        if (!FieldVerifier.isValidPourcentage(value2)) {
            errorLabelPreValue.addStyleName("serverResponseLabelError");
            errorLabelPreValue.setText("Pourcentage incorect (doit etre compris entre -100 et 100");
            return;
        }
        service.PreValue(value1,value2, new AsyncCallback<Integer>() {
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
//                Window.alert(SERVER_ERROR);
            }

            public void onSuccess(Integer result) {
                errorLabelPreValue.setText(" ");
                String envoi;
                envoi = valA.getText() + " et " + valPc2.getText() + "%";
                new DialogBoxInssetPresenter("Avant Remise", envoi, String.valueOf(result));
            }
        });
    }


}
