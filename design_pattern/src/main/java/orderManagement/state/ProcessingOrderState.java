/*
 * @ {#} ProcessingOrderState.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package orderManagement.state;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class ProcessingOrderState implements State {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Đóng gói và vận chuyển.");
        context.setState(new DeliveredOrderState());
    }
}

