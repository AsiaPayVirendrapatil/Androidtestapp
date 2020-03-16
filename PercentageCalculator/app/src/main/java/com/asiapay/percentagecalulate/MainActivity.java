package com.asiapay.percentagecalulate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.widget.ContentLoadingProgressBar;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements StudentContracts.View {
    private AppCompatEditText edtTxtStudentName, edtTxtStudentRollNo, edtTxtPhysics, edtTxtChemistry,
            edtTxtMaths, edtTxtEnglish, edtTxtHindi;
    private ContentLoadingProgressBar loadStudentDataProgressbar;
    private StudentDataBasePresenter studentDataBasePresenter;
    private AppCompatButton saveStudentData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        addEventListener();
        studentDataBasePresenter = new StudentDataBasePresenter(this, this);
    }

    public void initUI() {
        edtTxtStudentName = findViewById(R.id.edtTxtStudentName);
        edtTxtStudentRollNo = findViewById(R.id.edtTxtStudentRollNo);
        edtTxtPhysics = findViewById(R.id.edtTxtPhysics);
        edtTxtChemistry = findViewById(R.id.edtTxtChemistry);
        edtTxtMaths = findViewById(R.id.edtTxtMaths);
        saveStudentData = findViewById(R.id.btnSaveData);
        edtTxtEnglish = findViewById(R.id.edtTxtEnglish);
        edtTxtHindi = findViewById(R.id.edtTxtHindi);
        loadStudentDataProgressbar = findViewById(R.id.loadStudentDataProgressbar);
    }

    @Override
    public void addEventListener() {
        saveStudentData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student();
                student.setStudentName(edtTxtStudentName.getText().toString().trim());
                student.setStudentRollNo(edtTxtStudentRollNo.getText().toString().trim());
                student.setPhysics(edtTxtPhysics.getText().toString().trim());
                student.setChemistry(edtTxtChemistry.getText().toString().trim());
                student.setMaths(edtTxtMaths.getText().toString().trim());
                student.setEnglish(edtTxtEnglish.getText().toString().trim());
                student.setHindi(edtTxtHindi.getText().toString().trim());
                studentDataBasePresenter.onSaveButtonClick(student);

            }
        });

    }

    @Override
    public void showInvalidInputMessage(String forComponent, String message) {
        if (forComponent.equals("studentName")) {
            edtTxtStudentName.setError(message);
        } else if (forComponent.equals("studentRollNo")) {
            edtTxtStudentRollNo.setError(message);
        } else if (forComponent.equals("Enter Physics No")) {
            edtTxtPhysics.setError(message);
        } else if (forComponent.equals("Enter Chemistry No")) {
            edtTxtChemistry.setError(message);
        } else if (forComponent.equals("Enter Maths No")) {
            edtTxtMaths.setError(message);
        }

    }

    @Override
    public void onResponseSuccess(Student student) {
        Toast.makeText(this, "Database Created Successfully ", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onResponseFailure(Throwable throwable) {
        Toast.makeText(this, "Database not Created ", Toast.LENGTH_LONG).show();
    }

    @Override
    public void hideProgress() {
        loadStudentDataProgressbar.setVisibility(View.GONE);
    }

    @Override
    public void showProgress() {
        loadStudentDataProgressbar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideKeyboard() {
        Util.hideKeyboard(saveStudentData);
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        studentDataBasePresenter.onDestroy();
    }
}
