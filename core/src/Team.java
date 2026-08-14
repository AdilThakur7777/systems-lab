import java.util.ArrayList;

public class Team {
    private ArrayList<String> members;
    public Team() {
        this.members=new ArrayList<>();
    }
    public void addMember(String name)
    {
        members.add(name);
    }
    public ArrayList<String> getMembers()
    {
       return members;
    }


    public static void main() {
            Team team=new Team();
            team.addMember("Adil");
        team.addMember("Amit");
        team.addMember("Rohit");
        ArrayList<String> list1=team.getMembers();
        list1.add("Shristy");
        ArrayList<String> list2=team.getMembers();
        for(int i=0;i<list2.size();i++) {
            System.out.println(list1.get(i));
        }

    }
}
