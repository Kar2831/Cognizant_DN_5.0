package org.karthikeyan.methods;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.karthikeyan.methods.ecommerceTests.CartServiceTest;
import org.karthikeyan.methods.ecommerceTests.InventoryServiceTest;
import org.karthikeyan.methods.ecommerceTests.PaymentServiceTest;

@Suite
@SelectClasses({
        CartServiceTest.class,
        InventoryServiceTest.class,
        PaymentServiceTest.class
})
public class AllTests {
}
