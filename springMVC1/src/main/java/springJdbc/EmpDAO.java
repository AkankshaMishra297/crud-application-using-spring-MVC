package springJdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;    

public class EmpDAO {    
		JdbcTemplate template;    
		    
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}    
	

	public void create11() {
		 
		template.execute("create table emp91(id int)");
	}
	
	public int save(Emp p){    
	    String sql="insert into emp99(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";    
	    return template.update(sql);    
	}  
	
	
	public List<Emp> getEmployees(){    
	    return template.query("select * from emp99",new RowMapper<Emp>(){    
	        public Emp mapRow(ResultSet rs, int row) throws SQLException {    
	            Emp e=new Emp();    
	            e.setId(rs.getInt(1));    
	            e.setName(rs.getString(2));    
	            e.setSalary(rs.getInt(3));    
	            e.setDesignation(rs.getString(4));  
	            

	            return e;   
	            
	        }    
	    });    
}
}
