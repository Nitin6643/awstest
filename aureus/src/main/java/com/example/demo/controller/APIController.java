package com.example.demo.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@RestController
public class APIController {

	@GetMapping
	public Response index() throws IOException {
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType,
				"{\r\n    \"aureus\": {\r\n        \"request\": {\r\n            \"application\": \"VERSION1\",\r\n            \"component\": \"EARLY_CLAIMS\"\r\n        },\r\n        \"data\": {\r\n            \"PROPOSAL_NO\": \"03053268\",\r\n            \"NOMINEE3_BENEFIT_PERCENTAGE\": \"\",\r\n            \"ANNUALIZED_MODAL_PREMIUM\": \"209250.0\",\r\n            \"PAYMENT_MODE\": \"SINGLE\",\r\n            \"NOMINEE5_BENEFIT_PERCENTAGE\": \"\",\r\n            \"OWNER_INCOME\": \"1800000.0\",\r\n            \"LOGIN_DATE\": \"27/07/2021\",\r\n            \"PRODUCT_CODE\": \"WRS70N\",\r\n            \"NOMINEE3_RELATION\": \"\",\r\n            \"DOJ\": \"06/09/2017\",\r\n            \"APP_BIRTH_DATE\": \"05/07/1984\",\r\n            \"TYPEX\": \"C2L\",\r\n            \"SUM_ASSURED\": \"5000000.0\",\r\n            \"PREMIUM_TERM\": \"1\",\r\n            \"NOMINEE4_BENEFIT_PERCENTAGE\": \"\",\r\n            \"CHANNEL_DESC\": \"CAB\",\r\n            \"NOMINEE1_RELATION\": \"\",\r\n            \"APP_SUBMIT_DATE\": \"27/07/2021\",\r\n            \"NOMINEE1_BENEFIT_PERCENTAGE\": \"\",\r\n            \"NO_OF_RIDERS\": \"0\",\r\n            \"NOMINEE5_RELATION\": \"\",\r\n            \"POLICY_TERM\": \"ToAge70\",\r\n            \"NOMINEE4_RELATION\": \"\",\r\n            \"INSURED_OCCUPATION\": \"BUSINESS\",\r\n            \"APP_MEDICAL_CODE\": \"YES\",\r\n            \"GENDER\": \"\",\r\n            \"APP_MARITAL_STATUS\": \"MALE\",\r\n            \"INSURED_EDUCATION\": \"G\",\r\n            \"NOMINEE2_RELATION\": \"\",\r\n            \"APP_SEX\": \"MALE\",\r\n            \"AGENT_CODE\": \"CAB215\",\r\n            \"NOMINEE2_BENEFIT_PERCENTAGE\": \"\"\r\n        }\r\n    }\r\n}");
		Request request = new Request.Builder()
				.url("https://vjzb47ro5c.execute-api.ap-south-1.amazonaws.com/default/baxa_earlyclaimsmodel_suite")
				.method("POST", body)
				.addHeader("X-Amz-Content-Sha256", "beaead3198f7da1e70d03ab969765e0821b24fc913697e929e726aeaebf0eba3")
				.addHeader("X-Amz-Date", "20210803T160241Z")
				.addHeader("Authorization",
						"AWS4-HMAC-SHA256 Credential=AKIAYHRQURMBT3LFJT3H/20210803/ap-south-1/execute-api/aws4_request, SignedHeaders=host;x-amz-content-sha256;x-amz-date, Signature=baeb24bb9d1c1c85bcebd3f9b9c589e6b15ceab639409c5ec65496be3d34f3d9")
				.addHeader("Content-Type", "application/json").build();
		Response response = client.newCall(request).execute();
		return response;
	}
}
