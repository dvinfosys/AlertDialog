package net.dvinfosys.alertdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void AlertDialog(View view)
    {
        if(view.getId()==R.id.button) {
            MyAlertDialog myAlertDialog = new MyAlertDialog();
            myAlertDialog.show(getFragmentManager(), "My Alert Dialog");
        }
        if (view.getId()==R.id.btnday)
        {
            Days day= new Days();
            day.show(getFragmentManager(),"My Alert");
        }
        if (view.getId()==R.id.btncustom_dialog)
        {
            CustomDialog customDialog=new CustomDialog();
            customDialog.show(getFragmentManager(),"Custom Dialog");
        }
    }
}
