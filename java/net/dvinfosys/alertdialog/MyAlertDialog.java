package net.dvinfosys.alertdialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;


public class MyAlertDialog extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());

        builder.setTitle("My Dialog !");
        builder.setCancelable(false);
        builder.setMessage("Your Are Close The Dialog").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getActivity(),"Yes Clicked",Toast.LENGTH_SHORT).show();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"No Clicked",Toast.LENGTH_SHORT).show();
            }
        });

       // builder.setNegativeButton(R.);
        Dialog dialog=builder.create();
        return dialog;
    }
}
