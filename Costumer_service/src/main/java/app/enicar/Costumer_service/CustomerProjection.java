package app.enicar.Costumer_service;

import app.enicar.Costumer_service.dao.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer",types =  Customer.class)
interface CustomerProjection extends Projection{
    public Long getId();
    public String getName();
    public String getEmail();

}
