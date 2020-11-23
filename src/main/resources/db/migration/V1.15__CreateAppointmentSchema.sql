CREATE TABLE My_Appointment (
  my_client_id BIGINT,
  my_provider_id BIGINT,
  PRIMARY KEY (my_client_id, my_provider_id)
);

ALTER TABLE My_Appointment ADD CONSTRAINT FK_APPOINTMENT_CLIENT_ID FOREIGN KEY (my_client_id) REFERENCES My_Client(id);

ALTER TABLE My_Appointment ADD CONSTRAINT FK_APPOINTMENT_PROVIDER_ID FOREIGN KEY (my_provider_id) REFERENCES My_Service_Provider(id);

