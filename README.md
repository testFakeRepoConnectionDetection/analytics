# Analytics (fixture)

Risk analytics. Reads positions from Booking and market data from DataHub.

## Integrations (topology)

- Calls **DataHub** over HTTP for risk market data (`/api/v1/risk-market-data`).
- Consumes Kafka topic `positions.snapshot` produced by **Booking**.

## Data transiting on flows (Data Model fixture)

| Peer | Kind | Channel | data_category |
|------|------|---------|---------------|
| DataHub | API | /risk-market-data | `RISK_MARKET_DATA` |
| Booking | KAFKA (inbound) | positions.snapshot | `POSITION_SNAPSHOT` |

Constants: `fixture.flow.TransitDataTypes`. DTO: `RiskMarketDataRequestDto`.
