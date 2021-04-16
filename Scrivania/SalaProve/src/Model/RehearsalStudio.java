package Model;

public class RehearsalStudio {
    private String nome;
    private int maxComponenti;
    public String disponibilità;
    private String descrizione;


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

    }

