package Controller;

import Model.RehearsalStudio;
import Model.Studio;
import Model.User;
import View.*;
import View.Login.ChoiceLoginView;
import View.Login.LoginView;
import View.Login.UserLoginView;
import View.Owner.RehearsalView;
import View.SignIn.ChoiceSignInView;
import View.SignIn.SignInView;
import View.SignIn.UserSignInView;
import View.Owner.StudioView;
import View.User.UserView;

import javax.swing.*;
import java.util.ArrayList;

public class StudioManager {

    private RehearsalStudio rehearsalStudio;
    private StudioView studioView;
    private MainView mainView;
    private LoginView loginView;
    private SignInView signInView;
    private ChoiceSignInView choiceSignInView;
    private ChoiceLoginView choiceLoginView;
    private UserLoginView userLoginView;
    private UserSignInView userSignInView;
    private ArrayList<Studio> studios;

    private ArrayList<User> users;
    private UserView userView;
    private DefaultListModel<JButton> jButtonDefaultListModel;
    private RehearsalView rehearsalView;

    public void setMainView(MainView mainView){
        this.mainView = mainView;
    }

    public void setLoginView(LoginView loginView){
        this.loginView = loginView;
    }

    public void setSignInView(SignInView signInView){
        this.signInView = signInView;
    }

    public void setChoiceLoginView(ChoiceLoginView choiceLoginView){
        this.choiceLoginView = choiceLoginView;
    }

    public void setChoiceSignInView(ChoiceSignInView choiceSignInView){
        this.choiceSignInView = choiceSignInView;
    }

    public void setUserLoginView(UserLoginView userLoginView){
        this.userLoginView = userLoginView;
    }

    public void setUserSignInView(UserSignInView userSignInView){
        this.userSignInView = userSignInView;
    }

    public void setStudioView(StudioView studioView){ this.studioView = studioView; }

    public void refreshUserView(){
        if(userView != null)
            userView.onUpdateStudios(studios);
    }

    public void setFirstRehearsalView(StudioManager studioManager){

    }

    public void setRehearsalView(RehearsalView rehearsalView){
        this.rehearsalView = rehearsalView;
    }

    public void addStudio(Studio studio){
        if(studios != null)
        studios.add(studio);



    }


    public void saveOwner(){};
    public void saveUser(){};


//    public void setRehearsalStudioName(String nome) {
//        rehearsalStudio.setNome(nome);
//    }
//    public int getRehearsalStudioMaxComponenti(){
//        return rehearsalStudio.getMaxComponenti();
//    }
//    public void setRehearsalStudioMaxComponenti(int maxComponenti) {
//        rehearsalStudio.setMaxComponenti(maxComponenti);
//    }
//    public String getRehearsalStudioName(){
//        return rehearsalStudio.getNome();
//    }
//    public void setRehearsalStudioDescription(String descrizione) {
//        rehearsalStudio.setDescrizione(descrizione);
//    }
//    public String getRehearsalStudioDescription(){
//        return rehearsalStudio.getDescrizione();
//    }
//    public boolean getRehearsalStudioDsiponibilità(){
//        return rehearsalStudio.getDisponibilità();
//    }


}
