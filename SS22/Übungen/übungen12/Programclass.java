package übungen12;




public class Programclass 
{

    public static void main(String[] args) 
    {
        Model model = new Model(3); 
        View view = new View(model);
        Controller controller = new Controller(model, view);
    }

}