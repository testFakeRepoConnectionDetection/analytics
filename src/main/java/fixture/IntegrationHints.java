package fixture;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Risk analytics. Bidirectional HTTP with Trading/Pricing. Consumes Booking positions.
 * Calls DataHub for risk market data.
 *
 * <p>data_category: PRICED_TRADE, RISK_RESULT, POSITION_SNAPSHOT, RISK_MARKET_DATA.
 */
@RestController
@RequestMapping("/api/v1/priced-trades")
public class IntegrationHints {

  // POST /api/v1/priced-trades from Trading/Pricing — data_category PRICED_TRADE
  // HTTP POST trading-pricing /api/v1/risk-results — data_category RISK_RESULT (fixture.dto.RiskResultDto)
  // HTTP POST datahub /api/v1/risk-market-data — data_category RISK_MARKET_DATA
  //   (fixture.dto.RiskMarketDataRequestDto)

  /** data_category POSITION_SNAPSHOT — produced by Booking */
  @KafkaListener(topics = "positions.snapshot", groupId = "analytics-risk")
  public void onPositionSnapshot(String payload) {}
}
