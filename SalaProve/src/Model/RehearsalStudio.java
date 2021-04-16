package Model;

import View.Owner.RehearsalView;

import java.util.ArrayList;

public class RehearsalStudio {
    private String nome;
    private int maxComponenti;
    public String disponibilità;
    private String descrizione;
    private RehearsalView rehearsalView;
    private ArrayList<RehearsalStudio> rehearsalStudios;


    public RehearsalStudio(String nome, int maxComponenti, String disponibilità, String descrizione){
        this.nome = nome;
        this.maxComponenti = maxComponenti;
        this.disponibilità = disponibilità;
        this.descrizione = descrizione;
    }

        public String getNome () {
            return nome;
        }
//        public String setNome (String nome){
//            return this.nome;
//        }
        public int getMaxComponenti () {
            return maxComponenti;
        }
//        public int setMaxComponenti ( int maxComponenti){
//            return this.maxComponenti;
//        }
        public String getDescrizione () {
            return descrizione;
        }
//        public String setDescrizione (String descrizione){
//            return this.descrizione;
//        }
        public String getDisponibilità () {
            return disponibilità;
        }

    @Override
    public String toString() {
        return  "Rehearsal Studio: " +
                "Name =" + nome +
                ", maxComponenti =" + maxComponenti +
                ", description =" + descrizione +
                ", disponibilità =" + disponibilità;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMaxComponenti(int maxComponenti){
        this.maxComponenti = maxComponenti;
    }
    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }
    public void setDisponibilità(String disponibilità){
        this.disponibilità = disponibilità;
    }
    public void addRehearsalStudio(RehearsalStudio rehearsalStudio){
        if(rehearsalView != null)
            rehearsalView.onUpdateRehearsalStudios(rehearsalStudios);
    }
}

