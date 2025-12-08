import java.io.IOException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.Reader;
import com.google.gson.Gson;
public class Consultorio {
    private String consultas;
    private String medicos;

    public Consultorio(String consultas, String medicos) {
        this.consultas=consultas;
        this.medicos=medicos;
    }
    public static void main(String[]args) {
        try {

            Gson gson = new Gson();

            FileWriter writer= new FileWriter("consultorio.json");

            Medico medico1=new Medico(7,"Sebastian","Zalles",12);
			/*Medico medico2=new Medico(3,"Christian","Lopez",8);
			Medico medico3=new Medico(9,"Ademar","Duran",15);*/

            Consulta consulta1= new Consulta(1278433,"Gustabo","Calla",65,12,"diciembre",2025);
		    /*Consulta consulta2= new Consulta(1423333,"Sheyla","Savedra",5,12,"diciembre",2025);
		    Consulta consulta3= new Consulta(6866863,"Guillermo","Villalobos",35,12,"diciembre",2025);
		    Consulta consulta4= new Consulta(1457883,"Alvaro","Guzman",85,8,"diciembre",2025);
		    Consulta consulta5= new Consulta(4688933,"Diana","Flores",25,8,"diciembre",2025);
		    Consulta consulta6= new Consulta(8999433,"Lorena","Hurtado",15,8,"diciembre",2025);
		    Consulta consulta7= new Consulta(1224533,"Gisselle","Caero",12,15,"diciembre",2025);
		    Consulta consulta8= new Consulta(9998833,"Alejandro","Mamani",3,15,"diciembre",2025);
		    Consulta consulta9= new Consulta(3456833,"Aylin","Mendoza",6,15,"diciembre",2025);*/

            String jsonString1=gson.toJson(consulta1);
			/*String jsonString2=gson.toJson(consulta2);
			String jsonString3=gson.toJson(consulta3);
			String jsonString4=gson.toJson(consulta4);
			String jsonString5=gson.toJson(consulta5);
			String jsonString6=gson.toJson(consulta6);
			String jsonString7=gson.toJson(consulta7);
			String jsonString8=gson.toJson(consulta8);
			String jsonString9=gson.toJson(consulta9);*/



            writer.write(jsonString1);
			/*writer.write(jsonString2);
			writer.write(jsonString3);
			writer.write(jsonString4);
			writer.write(jsonString5);
			writer.write(jsonString6);
			writer.write(jsonString7);
			writer.write(jsonString8);
			writer.write(jsonString9);*/

            writer.close();

            System.out.println("");

        }catch( Exception e) {
            e.printStackTrace();
        }
        try {
            Gson gson=new Gson();

            Reader reader=Files.newBufferedReader(Paths.get("consultorio.json"));
            Consulta consulta1 = gson.fromJson(reader,Consulta.class);
            Medico medico1 = gson.fromJson(reader,Medico.class);
            System.out.println(", Medico: "+medico1.getId());
            reader.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}