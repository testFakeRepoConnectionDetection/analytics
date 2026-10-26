package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Price back to Trading/Pricing, trade inbound from Trading/Pricing, PV out to DataHub.
 *
 * <p>Edge fields: data price frequency real-time toward Trading/Pricing.
 * data trade frequency real-time inbound from Trading/Pricing.
 * data PV frequency real-time toward DataHub.
 */
@RestController
@RequestMapping("/api/v1/trades")
public class IntegrationHints {

  // POST /api/v1/trades from Trading/Pricing — data trade, frequency real-time
  // HTTP POST trading-pricing /api/v1/prices — data price, frequency real-time
  // HTTP POST datahub /api/v1/realtime-pv — data PV, frequency real-time
}
