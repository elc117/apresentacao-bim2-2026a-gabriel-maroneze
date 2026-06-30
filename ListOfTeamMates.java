import java.util.ArrayList;

public class ListOfTeamMates {
    public static void main(String[] args) {
         ArrayList<TeamMate> list = new ArrayList<TeamMate>();

         list.add(new TeamMate("SI10", "Joao Daniel", true));

         list.add(new TeamMate("SI20", "Gabriel Maroneze"));

         TeamMate novo = new TeamMate();
         novo.setUserId("SI30");
         novo.setName("Bernardo Candia");
         novo.setOnline(true);
         lista.add(novo);

         for (TeamMate i : list){
             System.out.println(i.getName());
         }

         for (TeamMate j : list){
             if(i.getOnline()){
                 System.out.println(j.getUserId());
             }
       }
    }
}