// This class was generated on Thu, 25 Jan 2018 09:31:12 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// Money.java
// @version 0.1.0-dev+20fb1e
// @type object
// @data H4sIAAAAAAAC/6yTb2sUMRDG3/sphrxqYe+2/gFh3xWLoGJbtAhSi51LZm8Hs8k6mfRcpN9dste79noFEXy15EkyM88vz/42F+NApjEfY6DRVOYLCuPC0yn2RTaV+UDj/eKEkhUelGMwjbnoCGwWoWBHwOAA+5iDQhsFEFoOGCyjhxv0mWZCHpUctEzezeFtFKBf2A+eKligx2AJosCAY09BwWWam8oci+C4HvKoMp8I3Vnwo2la9ImK8DOzkNsK5xIHEmVKprnc2ksqHJb7/jbTf7fR0Y7Zxzv7zi+1E6KZ7VDQKgm8+3w2e/Xi+et7JuXu1UHtok01B6WlYClQOxayWgslrTeHZ+Vwqg9BO1RgR0G5ZUqgDyj/ExGV/AhIyN7fVn+lMr3XDo2Nsk9h2qlg1bHtoOdlp7Cg5ls+Onpps5++tF55Xq+OA0wsSKag3FkrTj3/ILh+f/71eg0BhSBEBR0Htuj9CG1BzTGgn6+L1puqj3qAI8s9+u2Np3tdnJ486JXywvENO3JlwgjaxZwwOO3S0+3qjcMS5vJOcgcfQu4XJBDb7SCDR0vp7t/YSUgFiQgu3zzUEsxKnqDk6eqgUx1SU9er1WrOKc6jLGtOcUrbbDdA8057f/g/cnJ1++wPAAAA//8=
// DO NOT EDIT
package com.paypal.sdk.paypalsync;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The currency and amount for a financial value-related field. For example, balance or payment due.
 */
@Model
public class Money {

    // Required default constructor
    public Money() {}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/) that identifies the currency.
	*/
	@SerializedName("currency_code")
	private String currencyCode;

	public String currencyCode() { return currencyCode; }
	
	public Money currencyCode(String currencyCode) {
	    this.currencyCode = currencyCode;
	    return this;
	}

	/**
	* REQUIRED
	* The value, which might be:<ul><li>An integer for currencies like `JPY` that are not typically fractional.</li><li>A decimal fraction for currencies like `TND` that are subdivided into thousandths.</li></ul>For the required number of decimal places for a currency code, see [Currency codes - ISO 4217](https://www.iso.org/iso-4217-currency-codes.html).
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }
	
	public Money value(String value) {
	    this.value = value;
	    return this;
	}
}
