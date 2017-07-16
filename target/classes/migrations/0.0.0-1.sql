
CREATE TABLE IF NOT EXISTS Representative (
  id SERIAL PRIMARY KEY,
  traker VARCHAR(25) NOT NULL,
  first_name VARCHAR(25) NOT NULL,
  middle_name VARCHAR(25),
  last_name VARCHAR(25),
  url VARCHAR(100),
  in_office BOOLEAN NOT NULL DEFAULT 'f',
  next_election_date DATE NOT NULL,
  votes_total INT,
  votes_missed INT
);

CREATE TABLE IF NOT EXISTS State (
	id SERIAL PRIMARY KEY,
	name VARCHAR(25) NOT NULL,
	abbreviation CHAR(2) NOT NULL
);

CREATE TABLE IF NOT EXISTS Representative_State (
	representative_id INT NOT NULL,
	state_id INT NOT NULL,
	PRIMARY KEY(representative_id, state_id),
	FOREIGN KEY(representative_id) REFERENCES Representative(id),
	FOREIGN KEY(state_id) REFERENCES State(id)
);

CREATE TABLE IF NOT EXISTS Party (
	id SERIAL PRIMARY KEY,
	name VARCHAR(25) NOT NULL,
	abbreviation CHAR(2) NOT NULL
);

CREATE TABLE IF NOT EXISTS Reputation (
	id SERIAL PRIMARY KEY,
	name VARCHAR(25) NOT NULL,
	min_value INT NOT NULL,
	max_value INT NOT NULL
);

CREATE TABLE IF NOT EXISTS Person (
	id SERIAL PRIMARY KEY,
	party_id INT NOT NULL,
	reputation_id INT NOT NULL,
	FOREIGN KEY(party_id) REFERENCES Party(id),
	FOREIGN KEY(reputation_id) REFERENCES Reputation(id)
);

CREATE TABLE IF NOT EXISTS Bill (
	id SERIAL PRIMARY KEY,
	congress_session INT NOT NULL,
	tracker VARCHAR(25) NOT NULL,
	url VARCHAR(100),
	name VARCHAR(50) NOT NULL,
	introduced_date DATE NOT NULL,
	last_major_action_date DATE
);

CREATE TABLE IF NOT EXISTS BillAction (
	id SERIAL PRIMARY KEY,
	executed_date DATE NOT NULL,
	description VARCHAR(500) NOT NULL
);

CREATE TABLE IF NOT EXISTS Bill_BillAction (
	bill_id INT NOT NULL,
	billaction_id INT NOT NULL,
  PRIMARY KEY(bill_id, billaction_id),
	FOREIGN KEY(billaction_id) REFERENCES BillAction(id),
	FOREIGN KEY(bill_id) REFERENCES Bill(id)
);

CREATE TABLE IF NOT EXISTS Representative_State (
	state_id INT NOT NULL,
	representative_id INT NOT NULL,
  PRIMARY KEY(state_id, representative_id),
	FOREIGN KEY(state_id) REFERENCES State(id),
	FOREIGN KEY(representative_id) REFERENCES Representative(id)
);

CREATE TABLE IF NOT EXISTS Person_Bill (
	Person_id INT NOT NULL,
	bill_id INT NOT NULL,
	follow BOOLEAN DEFAULT 'f',
  PRIMARY KEY(Person_id, bill_id),
	FOREIGN KEY(Person_id) REFERENCES Person(id),
	FOREIGN KEY(bill_id) REFERENCES Bill(id)
);

CREATE TABLE IF NOT EXISTS Representative_Bill (
	id SERIAL PRIMARY KEY
);

DROP * IN State;

INSERT INTO State (name, abbreviation) VALUES
    ('ALABAMA', 'AL'),
    ('ALASKA', 'AK'),
    ('ARIZONA', 'AZ'),
    ('ARKANSAS', 'AR'),
    ('CALIFORNIA', 'CA'),
    ('COLORADO', 'CO'),
    ('CONNECTICUT', 'CT'),
    ('DELAWARE', 'DE'),
    ('FLORIDA', 'FL'),
    ('GEORGIA', 'GA'),
    ('HAWAII', 'HI'),
    ('IDAHO', 'ID'),
    ('ILLINOIS', 'IL'),
    ('INDIANA', 'IN'),
    ('IOWA', 'IA'),
    ('KANSAS', 'KS'),
    ('KENTUCKY', 'KY'),
    ('LOUISIANA', 'LA'),
    ('MAINE', 'ME'),
    ('MARYLAND', 'MD'),
    ('MASSACHUSETTS', 'MA'),
    ('MICHIGAN', 'MI'),
    ('MINNESOTA', 'MN'),
    ('MISSISSIPPI', 'MS'),
    ('MISSOURI', 'MO'),
    ('MONTANA', 'MT'),
    ('NEBRASKA', 'NE'),
    ('NEVADA', 'NV'),
    ('NEW HAMPSHIRE', 'NH'),
    ('NEW JERSEY', 'NJ'),
    ('NEW MEXICO	', 'NM'),
    ('NEW YORK', 'NY'),
    ('NORTH CAROLINA', 'NC'),
    ('NORTH DAKOTA	', 'ND'),
    ('OHIO', 'OH'),
    ('OKLAHOMA', 'OK'),
    ('OREGON', 'OR'),
    ('PENNSYLVANIA', 'PA'),
    ('RHODE ISLAND', 'RI'),
    ('SOUTH CAROLINA	', 'SC'),
    ('SOUTH DAKOTA', 'SD'),
    ('TENNESSEE', 'TN'),
    ('TEXAS', 'TX'),
    ('UTAH', 'UT'),
    ('VERMONT', 'VT'),
    ('VIRGINIA', 'VA'),
    ('WASHINGTON', 'WA'),
    ('WEST VIRGINIA', 'WV'),
    ('WISCONSIN', 'WI'),
    ('WYOMING', 'WY');
