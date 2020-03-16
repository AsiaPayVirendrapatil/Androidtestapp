package com.asiapay.percentagecalulate;

import android.content.Context;

public class StudentDataBasePresenter implements StudentContracts.Presenter, StudentContracts.Model.OnFinishedListener {

    private StudentContracts.View viewStudent;
    private StudentContracts.Model studentModel;
    private Context mContext;

    public StudentDataBasePresenter(Context context, StudentContracts.View mainStudentView) {
        this.viewStudent = mainStudentView;
        this.mContext = context;
        this.studentModel = new StudentDataBaseModel(context);
    }

    @Override
    public void onDestroy() {
        viewStudent = null;
    }

    @Override
    public void requestData() {

    }

    @Override
    public void onSaveButtonClick(Student student) {

        if (student.getStudentName().equals("")) {
            viewStudent.showInvalidInputMessage("studentName", "Please enter Student name");
        } else if (student.StudentRollNo.equals("")) {
            viewStudent.showInvalidInputMessage("studentRollNo", "Please enter RollNo");
        } else if (student.Physics.equals("")) {
            viewStudent.showInvalidInputMessage("Enter Physics No", "Please enter Physics No");
        } else if (student.Chemistry.equals("")) {
            viewStudent.showInvalidInputMessage("Enter Chemistry No", "Please enter Chemistry No");
        } else if (student.Maths.equals("")) {
            viewStudent.showInvalidInputMessage("Enter Maths No", "Please enter Maths No");
        } else if (student.English.equals("")) {
            viewStudent.showInvalidInputMessage("Enter English No", "Please enter English No");
        } else if (student.Hindi.equals("")) {
            viewStudent.showInvalidInputMessage("Enter Hindi No", "Please enter Hindi No");
        } else {
            viewStudent.showProgress();
            float strTotalValue = Float.valueOf(student.getPhysics() + student.getChemistry() + student.getMaths() + student.English + student.Hindi);
            float percentage = Float.parseFloat(String.valueOf((strTotalValue / 500) * 100));
            student.setPercentage(percentage);
            studentModel.insertStudentEntry(this, student);
        }

    }

    @Override
    public void onSuccess(Student student) {
        if (viewStudent != null) {
            viewStudent.hideProgress();
        }
        viewStudent.onResponseSuccess(student);
    }

    @Override
    public void onFailure(Throwable t) {
        if (viewStudent != null) {
            viewStudent.hideProgress();
        }
        viewStudent.onResponseFailure(t);
    }
}
