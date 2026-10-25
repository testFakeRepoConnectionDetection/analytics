package fixture.dto;

/**
 * Risk market data request sent to DataHub.
 * flow data_category: RISK_MARKET_DATA
 */
public record RiskMarketDataRequestDto(String book, String curveId, String asOfDate) {}
