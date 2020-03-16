package com.asiapay.percentagecalulate;

public interface StudentContracts {

    interface Model {
        interface OnFinishedListener {
            void onSuccess(Student student);
            void onFailure(Throwable t);
        }
        void insertStudentEntry(OnFinishedListener onFinishedListener, Student student);


    }


    interface Presenter {
        void onDestroy();

        void requestData();

        void onSaveButtonClick(Student student);

    }

    interface View extends CoreViewAction{
        void showInvalidInputMessage(String  studentName, String studentRollNo);


        void onResponseSuccess(Student student);

        void onResponseFailure(Throwable throwable);


    }
}
