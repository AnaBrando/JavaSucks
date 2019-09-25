import java.util.*;
import java.sql.*;

public class PizzaDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Pizza e){
		int status=0;
		try{
			Connection con=PizzaDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into pizza(nome,vendedor,descricao,loja,feedback,vendido,preco) values (?,?,?,?,?,?)");
			ps.setString(1,e.getNome());
			ps.setString(2,e.getVendedor());
			ps.setString(3,e.getDescricao());
			ps.setString(4,e.getFeedback());
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int update(Pizza e){
		int status=0;
		try{
			Connection con=PizzaDao.getConnection();
			PreparedStatement ps=con.prepareStatement("update pizza set nome=?,descricao=?,feedback=?,vendido=?,preco=?where id=?");
			ps.setString(1,e.getNome());
			ps.setString(2,e.getVendedor());
			ps.setString(3,e.getDescricao());
			ps.setString(4,e.getFeedback());
			ps.setInt(5,e.getId());
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con=PizzaDao.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from pizza where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return status;
	}
	public static Pizza getPizzaId(int id){
		Pizza e=new Pizza();
		
		try{
			Connection con=PizzaDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from pizza where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setVendedor(rs.getString(3));
				e.setDescricao((rs.getString(4)));
				e.setLoja((rs.getString(5)));
				e.setFeedback(rs.getString(6));
			
				
			}
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return e;
	}
	public static List<Pizza> getAllPizzas(){
		List<Pizza> list=new ArrayList<Pizza>();
		
		try{
			Connection con=PizzaDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user905");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Pizza e=new Pizza();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setVendedor(rs.getString(3));
				e.setDescricao(rs.getString(4));
				e.setLoja(rs.getString(5));
				e.setFeedback(rs.getString(6));
				e.setVendido(rs.getBoolean(7));
				e.setPreco(rs.getDouble(8));
				list.add(e);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}
}
