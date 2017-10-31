public class TOSalaries {
    private int emp_no;
    private String dept_no;
    private Calendar from_date;
    private Calendar to_date;
    
    public TOSalaries(){
        
    }
    
    public TOSalaries(int emp_no,String dept_no,Calendar from_date,Calendar to_date){
        this.dept_no=dept_no;
        this.emp_no=emp_no;
        this.from_date=from_date;
        this.to_date=to_date;
        
                
    }

    public int getEmp_no() {
        return emp_no;
    }

    
    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getDept_no() {
        return dept_no;
    }

    
    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
    }

    
    public Calendar getFrom_date() {
        return from_date;
    }

   
    public void setFrom_date(Calendar from_date) {
        this.from_date = from_date;
    }

    
    public Calendar getTo_date() {
        return to_date;
    }

     
    public void setTo_date(Calendar to_date) {
        this.to_date = to_date;
    }
           
}
