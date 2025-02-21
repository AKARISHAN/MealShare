package com.example.mealshare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DonationRequestActivity extends AppCompatActivity {

    EditText edtFullName, edtContact, edtAddress;
    Button btnCallDonor, btnSubmitRequest;
    String donorPhoneNumber = "0753883167";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_request);

        // Initialize Views
        edtFullName = findViewById(R.id.edt_fullname);
        edtContact = findViewById(R.id.edt_contact);
        edtAddress = findViewById(R.id.edt_address);
        btnCallDonor = findViewById(R.id.btn_call_donor);
        btnSubmitRequest = findViewById(R.id.btn_submit_request);

        // Call Donor Button
        btnCallDonor.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:" + donorPhoneNumber));
            startActivity(callIntent);
        });

        // Submit Request Button
        btnSubmitRequest.setOnClickListener(v -> {
            String fullName = edtFullName.getText().toString().trim();
            String contact = edtContact.getText().toString().trim();
            String address = edtAddress.getText().toString().trim();

            if (fullName.isEmpty() || contact.isEmpty() || address.isEmpty()) {
                Toast.makeText(DonationRequestActivity.this, "Please fill in all fields!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(DonationRequestActivity.this, "Request Submitted Successfully!", Toast.LENGTH_SHORT).show();
            }
        });
        Button signUpTextView2 = findViewById(R.id.backButton2);
        signUpTextView2.setOnClickListener(view -> {
            startActivity(new Intent(DonationRequestActivity.this, MainActivity2.class));
        });
    }
}
