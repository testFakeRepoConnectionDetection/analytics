"""Risk analytics.

Sends the price to Trading/Pricing on /api/v1/prices.
Receives the trade from Trading/Pricing on /api/v1/trades.
Sends PV to DataHub on /api/v1/realtime-pv.
"""

BUSINESS_FUNCTION = "MIDDLE_OFFICE"
PILLAR = "Trading & Analytics"

DATA_PRICE = "price"
DATA_TRADE = "trade"
DATA_PV = "PV"
FREQUENCY_REAL_TIME = "real-time"


def publish_price():
    """Outbound to Trading/Pricing. data price, frequency real-time."""
    return {
        "peer": "Trading/Pricing",
        "channel": "https://trading-pricing.internal/api/v1/prices",
        "data": DATA_PRICE,
        "frequency": FREQUENCY_REAL_TIME,
    }


def accept_trade(trade):
    """Inbound from Trading/Pricing on /api/v1/trades. data trade, frequency real-time."""
    return {
        "peer": "Trading/Pricing",
        "channel": "/api/v1/trades",
        "data": DATA_TRADE,
        "frequency": FREQUENCY_REAL_TIME,
        "trade": trade,
    }


def publish_present_value(present_value):
    """Outbound to DataHub on /api/v1/realtime-pv. data PV, frequency real-time."""
    return {
        "peer": "DataHub",
        "channel": "https://datahub.internal/api/v1/realtime-pv",
        "data": DATA_PV,
        "frequency": FREQUENCY_REAL_TIME,
        "present_value": present_value,
    }
