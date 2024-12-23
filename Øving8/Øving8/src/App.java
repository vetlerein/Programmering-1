import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args) {
        Person knud = new Person("Knud", "Knudsen", 2000);
        
        ArbTaker arbTakerKnud = new ArbTaker(knud, 2223, 2010, 50000, 50);

        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        int år = kalender.get(java.util.Calendar.YEAR);

        while(true){
            String[] options = 
            {"Skatt per mnd", "Bruttolønn per år", "Navn på arbtaker", "Alder på arbtaker", 
            "Antall år ansatt", "Ansatt lengre enn x ?", "Forandre skatteprosent?", "Forandre månedslønn?"};
            ImageIcon icon = new ImageIcon("");
            String n = (String)JOptionPane.showInputDialog(null, "Hva vil du gjøre/finne ut av?", 
                "Meny for "+knud.getFornavn(), JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);

            if (n == (options[0])) {
                JOptionPane.showMessageDialog(null, knud.getFornavn()+ " betaler " + arbTakerKnud.mndSkatt()+"kr i skatt i måneden.");
            } else if (n == (options[1])){
                JOptionPane.showMessageDialog(null, "Tjener "+arbTakerKnud.årsLønn()+" i året.");
            } else if (n == (options[2])){
                JOptionPane.showMessageDialog(null, arbTakerKnud.printNavn(knud));
            }else if (n == (options[3])){
                JOptionPane.showMessageDialog(null, arbTakerKnud.printAlder(knud));
            }else if (n == (options[4])){
                JOptionPane.showMessageDialog(null, arbTakerKnud.årAnsatt());
            }else if (n == (options[5])){
                String årFra = JOptionPane.showInputDialog(null,"Fra hvilket år lurer du på?");
                if (år-Integer.parseInt(årFra)<(år-arbTakerKnud.getAnsettelsesår())) {
                    JOptionPane.showMessageDialog(null, knud.getFornavn()+" ble ansatt før "+årFra+".");
                } else if (år-Integer.parseInt(årFra)>(år-arbTakerKnud.getAnsettelsesår())){
                    JOptionPane.showMessageDialog(null, knud.getFornavn()+" ble ansatt etter "+årFra+".");
                } else {
                    JOptionPane.showMessageDialog(null, knud.getFornavn()+" ble ansatt dette året");
                }
            }else if(n == options[6]){
                String nySkatteProsent = JOptionPane.showInputDialog(null,"Hva vil du sette som ny skatteprosent?");
                arbTakerKnud.setSkatteprosent(Integer.parseInt(nySkatteProsent));;
                JOptionPane.showMessageDialog(null, "Den nye skatteprosenten er nå "+arbTakerKnud.getSkatteprosent()+"%");
            }else if(n == options[7]){
                String nyMånedsLønn = JOptionPane.showInputDialog(null,"Hva vil du sette som ny månedslønn?");
                arbTakerKnud.setMånedslønn(Integer.parseInt(nyMånedsLønn));
                JOptionPane.showMessageDialog(null, "Den nye månedslønnen er nå "+arbTakerKnud.getMånedslønn()+"kr");            
            }else{
                break;
            }
        }
    }
}
