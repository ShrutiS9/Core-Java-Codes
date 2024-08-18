class DB_Driver{

    public void getDriver(){
    
    System.out.println("Type-1 Driver");
    
    }
    
    }
    
    class New_DB_Driver extends DB_Driver{
    
    public void getDriver(){
    
    System.out.println("Type-4-Driver");
    
    }
    
    }
    
    class superk{
    
    public static void main(String args[]){
        
    New_DB_Driver driver=new New_DB_Driver();
    
    driver.getDriver();
    
    

    
    }
    
    
}