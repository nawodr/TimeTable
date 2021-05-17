DROP TABLE IF EXISTS AcdYerAndSem;

CREATE TABLE 'AcdYerAndSem' (
	'idAcdYerAndSem'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'yerName'	INTEGER
);


DROP TABLE IF EXISTS 'DegreePro';

CREATE TABLE 'DegreePro' (
	'idDegPro'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'degName'	TEXT
);

DROP TABLE IF EXISTS 'GroupNum';

CREATE TABLE 'GroupNum' (
	'idGrp_num'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'grp_num'	TEXT
);

DROP TABLE IF EXISTS 'GroupNumGenerate';

CREATE TABLE 'GroupNumGenerate' (
	'idGrpNumGen'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'GrpNum'	TEXT,
	'yNsId'	TEXT,
	'dpId'	TEXT,
	'gnoId'	TEXT
);

DROP TABLE IF EXISTS 'Lecture';

CREATE TABLE 'Lecture' (
	'id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'empid'	INTEGER,
	'empname'	TEXT,
	'faculty'	TEXT,
	'department'	TEXT,
	'center'	TEXT,
	'building'	TEXT,
	'level'	INTEGER,
	'rank'	TEXT
);


DROP TABLE IF EXISTS 'Module';

CREATE TABLE 'Module' (
	'id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'offeredyear'	TEXT,
	'offeredsem'	TEXT,
	'mname'	TEXT,
	'mcode'	TEXT,
	'lechrs'	INTEGER,
	'thrs'	INTEGER,
	'labhrs'	INTEGER,
	'evahrs'	INTEGER
);

DROP TABLE IF EXISTS 'Student';

CREATE TABLE 'Student' (
	'idStudent'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'id'	INTEGER
);

DROP TABLE IF EXISTS 'SubGrpGenerate';

CREATE TABLE 'SubGrpGenerate' (
	'idSubGrpGen'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'SubGrpGenName'	TEXT,
	'sGno'	TEXT,
	'gId'	TEXT
);

DROP TABLE IF EXISTS 'SubGrpNumtbl';

CREATE TABLE 'SubGrpNumtbl' (
	'idSubGrpNum'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'subGrpNum'	TEXT
);

DROP TABLE IF EXISTS 'Tag';

CREATE TABLE 'Tag' (
	'tagId'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'tagName'	TEXT,
	'tagCode'	TEXT,
	'relatedTag'	TEXT
);

DROP TABLE IF EXISTS 'all_details';

CREATE TABLE 'all_details' (
	'id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'yNs'	TEXT,
	'dp'	TEXT,
	'gNo'	TEXT,
	'gId'	TEXT,
	'sGid'	TEXT
);

DROP TABLE IF EXISTS 'building_Details';

CREATE TABLE 'building_Details' (
	'id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'name'	TEXT
);


DROP TABLE IF EXISTS 'consecutive_Location';

CREATE TABLE 'consecutive_Location' (
	'cons_Id'	INTEGER,
	'grp_Id'	TEXT,
	'cons_Sessions'	TEXT,
	'session_Id'	TEXT,
	'room'	TEXT
);

DROP TABLE IF EXISTS 'group_Location';

CREATE TABLE 'group_Location' (
	'group_Id'	TEXT NOT NULL,
	'room'	TEXT,
	PRIMARY KEY('group_Id')
);

DROP TABLE IF EXISTS 'lecturer_Location';

CREATE TABLE 'lecturer_Location' (
	'id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'name'	TEXT,
	'faculty'	TEXT,
	'building'	TEXT,
	'room'	TEXT
);

DROP TABLE IF EXISTS 'location';

CREATE TABLE 'location' (
	'Id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'building_Name'	TEXT,
	'room_Name'	TEXT,
	'room_Type'	TEXT,
	'capacity'	INTEGER
);

DROP TABLE IF EXISTS module_Location;

CREATE TABLE 'module_Location' (
	'code'	TEXT,
	'name'	TEXT,
	'year'	TEXT,
	'semester'	TEXT,
	'room'	TEXT,
	PRIMARY KEY('code')
);

DROP TABLE IF EXISTS notAvailableLocation;

CREATE TABLE 'notAvailableLocation' (
	'id'	TEXT,
	'room'	TEXT,
	'date'	TEXT,
	'start'	TEXT,
	'end'	TEXT,
	PRIMARY KEY('id')
);

DROP TABLE IF EXISTS notAvailableTime;

CREATE TABLE 'notAvailableTime' (
	'id'	TEXT,
	'lecturer'	TEXT,
	'session'	TEXT,
	'stuGroup'	TEXT,
	'subGroup'	TEXT,
	'date'	TEXT,
	'start'	TEXT,
	'end'	TEXT,
	PRIMARY KEY('id')
);

DROP TABLE IF EXISTS session;

CREATE TABLE 'session' (
	'id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'subject'	TEXT DEFAULT NULL,
	'sub_code'	TEXT DEFAULT NULL,
	'tag'	TEXT DEFAULT NULL,
	'tag_duration'	TEXT DEFAULT NULL,
	'group_id'	TEXT DEFAULT NULL,
	'subgroup_id'	TEXT DEFAULT NULL,
	'stu_count'	TEXT DEFAULT NULL
);

DROP TABLE IF EXISTS sessionLec;

CREATE TABLE 'sessionLec' (
	'id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'sId'	TEXT,
	'lId'	TEXT
);

DROP TABLE IF EXISTS session_Location;

CREATE TABLE 'session_Location' (
	'session_Id'	INTEGER,
	'subject'	TEXT,
	'sub_code'	TEXT,
	'tag'	TEXT,
	'tag_duration'	TEXT,
	'group_id'	TEXT,
	'subgroup_id'	TEXT,
	'stu_count'	TEXT,
	'room'	TEXT
);

DROP TABLE IF EXISTS sp2_consecutive_session;

CREATE TABLE 'sp2_consecutive_session' (
	'id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'sGid'	TEXT,
	'cSession'	TEXT,
	'sessionID'	TEXT
);

DROP TABLE IF EXISTS sp2_nonoverlapping_session;

CREATE TABLE 'sp2_nonoverlapping_session' (
	'id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'sGid'	TEXT,
	'cSession'	TEXT,
	'SessionID'	TEXT
);

DROP TABLE IF EXISTS sp2_parallel_session;

CREATE TABLE 'sp2_parallel_session' (
	'id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'yNs'	TEXT,
	'session'	TEXT,
	'sessionID'	TEXT
);


DROP TABLE IF EXISTS tag_Location;

CREATE TABLE 'tag_Location' (
	'id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'tag_Name'	TEXT,
	'tag_Code'	TEXT,
	'related_Tag'	TEXT,
	'room_Name'	TEXT
);


DROP TABLE IF EXISTS timeslots;

CREATE TABLE 'timeslots' (
	'id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'start'	TEXT,
	'end'	TEXT,
	'slotType'	INTEGER
);

DROP TABLE IF EXISTS workingDays;

CREATE TABLE 'workingDays' (
	'id'	INTEGER PRIMARY KEY AUTOINCREMENT,
	'noOfWorkingDays'	INTEGER,
	'workingDays'	TEXT,
	'workingHours'	TEXT
);