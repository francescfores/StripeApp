package sensors.francesc.dam2.iesebre.com.stripeapp.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import sensors.francesc.dam2.iesebre.com.stripeapp.R;

/**
 * Created by francesc on 06/02/16.
 */
public class ErrorDialogFragment {

    public static ErrorDialogFragment newInstance(int titleId, String message) {
        ErrorDialogFragment fragment = new ErrorDialogFragment();

        Bundle args = new Bundle();
        args.putInt("titleId", titleId);
        args.putString("message", message);

        fragment.setArguments(args);

        return fragment;
    }

    public ErrorDialogFragment() {
        // Empty constructor required for DialogFragment
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int titleId = getArguments().getInt("titleId");
        String message = getArguments().getString("message");

        return new AlertDialog.Builder(getActivity())
                .setTitle(titleId)
                .setMessage(message)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();
    }
}
