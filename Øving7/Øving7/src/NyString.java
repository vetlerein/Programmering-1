public class NyString{
    private final String tekst;

    public NyString(String tekst){
        this.tekst = tekst;

    }

    public String forkort(){
        String[] ord = tekst.split(" ");
        StringBuilder forkortet = new StringBuilder();
        
        for (String ordet : ord){
            if(!ordet.isEmpty()){
                forkortet.append(ordet.charAt(0));
            }
        }

        return forkortet.toString();

    }

    public String fjernTegn(char tegn){
        String resultat = tekst;
        int posisjon = resultat.indexOf(tegn);

        while (posisjon != -1){
            resultat = resultat.substring(0, posisjon) + resultat.substring(posisjon + 1);
            posisjon = resultat.indexOf(tegn);
        }

        return resultat;
    }
}
