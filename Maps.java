import java.util.Map;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        
        Map<String, Double> duds = new HashMap<>();
        
        duds.put("[CODIGO1]", 5.4567);
        duds.put("[CODIGO2]", 5.4568);
        duds.put("[CODIGO3]", 5.4569);
        duds.put("[CODIGO4]", 5.4570);
        duds.put("[CODIGO5]", 5.4571);
        
        duds.put("[CODIGO1]", 5.4569);
        
        
        System.out.println("ERROR: " + duds.get("[CODIGO1]"));
    }
}