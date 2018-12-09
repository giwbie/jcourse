import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // CustomerService service = new CustomerServiceImpl();

    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    CustomerService custService = appContext.getBean("customerService", CustomerService.class);

    System.out.println(custService.findAll().get(0).getFirstname());
  }

}
