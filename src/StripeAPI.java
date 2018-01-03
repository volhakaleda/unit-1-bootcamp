import com.stripe.Stripe;
import com.stripe.exception.*;
import com.stripe.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StripeAPI {


    private static String customerId = " ";

    public static void main(String[] args) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {

        countOfCustomerAndEmails();
        createRetriveAndRefundCharge();
        createUpdateDeleteCustomer();
        createUpdateDeleteInvoice();
    }

        public static void countOfCustomerAndEmails() throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {

            Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";

            Map<String, Object> customerParams = new HashMap<>();
            customerParams.put("limit", "8");
            CustomerCollection customers = Customer.all(customerParams);
//            API returns null total count of customers, hence needed to comment out, to show that the method is possible,
//            but the result returned is null

//            if(customers != null) {
//                int totalCount = customers.getTotalCount();
//                System.out.println("Total count of customers: " + totalCount);
//            }

            List<Customer> data = customers.getData();
            for(int i = 0; i < data.size(); i++) {
                Customer cust = data.get(i);
                String email = cust.getEmail();
                System.out.println(email);
            }
        }

        public static void createRetriveAndRefundCharge() throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {

            Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";

            Map<String, Object> chargeParams = new HashMap<>();
            chargeParams.put("amount", 2000);
            chargeParams.put("currency", "usd");
            chargeParams.put("description", "Charge for olivia.brown@example.com");
            chargeParams.put("source", "tok_visa");

            Charge charge = Charge.create(chargeParams);
            String chargeId = charge.getId();
            Charge.retrieve(chargeId);

            Map<String, Object> refundParams = new HashMap<>();
            refundParams.put("charge", charge);

            Refund ref = new Refund();
            ref.update(refundParams);


        }

        public static void createUpdateDeleteCustomer() throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {

        Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";

            Map<String, Object> customerParams = new HashMap<>();
            customerParams.put("description", "Customer volhakaleda");
            customerParams.put("email", "Customer for volhakaleda@mail.ru");
            customerParams.put("source", "tok_visa");
            Customer createdCustomer = Customer.create(customerParams);
            System.out.println(customerParams);
            customerId = createdCustomer.getId();

            Customer updatedCustomer = Customer.retrieve(customerId);
            Map<String, Object> updateParams = new HashMap<>();
            updateParams.put("description", "Updated Customer for volhakaleda@mail.ru");
            updateParams.put("email", "Updated Email for volhakaleda@gmail.com");

            updatedCustomer.update(updateParams);
            System.out.println(updateParams);

            updatedCustomer.delete();

        }

        public static void createUpdateDeleteInvoice() throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException {

            Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";

            Map<String, Object> invoiceParams = new HashMap<>();
            invoiceParams.put("customer", customerId);

            Invoice invoice = Invoice.create(invoiceParams);
            String invoiceID = invoice.getId();

            Invoice updatedInvoice = Invoice.retrieve(invoiceID);
            Map<String, Object> updateParams = new HashMap<>();
            updateParams.put("closed", "true");
            updatedInvoice.update(updateParams);

            InvoiceItem ii = InvoiceItem.retrieve(invoiceID);
            ii.delete();
        }

    }


