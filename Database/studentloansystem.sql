-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2024 at 08:51 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentloansystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_table`
--

CREATE TABLE `admin_table` (
  `ID` int(11) NOT NULL,
  `UserName` varchar(50) NOT NULL DEFAULT 'admin',
  `Password` varchar(50) NOT NULL DEFAULT 'admin123',
  `EmailAddress` varchar(50) NOT NULL DEFAULT 'admin@gmail.com',
  `IsActive` bit(1) NOT NULL DEFAULT b'1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_table`
--

INSERT INTO `admin_table` (`ID`, `UserName`, `Password`, `EmailAddress`, `IsActive`) VALUES
(1, 'admin', 'admin123', 'admin@gmail.com', b'1');

-- --------------------------------------------------------

--
-- Table structure for table `education_table`
--

CREATE TABLE `education_table` (
  `id` int(11) NOT NULL,
  `department` varchar(50) NOT NULL,
  `program_enrolled` varchar(50) NOT NULL,
  `year_level` varchar(50) NOT NULL,
  `student_id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `education_table`
--

INSERT INTO `education_table` (`id`, `department`, `program_enrolled`, `year_level`, `student_id`) VALUES
(1, 'dep', 'prog', '4', NULL),
(2, 'Technology', 'BS Info Tech', '3', NULL),
(3, 'Technology', 'BS Info Tech', '3', NULL),
(4, 'Business', 'BSHM', '2', NULL),
(5, 'Business', 'BSBA', '3', NULL),
(6, 'Education', 'BSED - English', '1', NULL),
(7, 'tgdfgsdf', 'sdfdsfg', '43', NULL),
(8, 'Education', 'BSED - Mathematics', '3', NULL),
(9, 'Technology', 'BS Information Technology', '1', NULL),
(10, 'Education', 'BEED', '2', '231-09876'),
(11, 'Business', 'BSBA', '2', '123-82345'),
(12, 'Technology', 'BS Info Tech', '2', '232-98673'),
(13, 'Technology', 'BS Information Technology', '4', '125-658963'),
(14, 'Education', 'BSED Math', '3', '123-12332');

-- --------------------------------------------------------

--
-- Table structure for table `guardians`
--

CREATE TABLE `guardians` (
  `id` int(11) NOT NULL,
  `student_id` varchar(50) NOT NULL,
  `department` varchar(50) DEFAULT NULL,
  `program_enrolled` varchar(50) DEFAULT NULL,
  `year_level` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `loan_table`
--

CREATE TABLE `loan_table` (
  `id` int(11) NOT NULL,
  `student_id` varchar(50) NOT NULL,
  `amount` double NOT NULL,
  `num_of_yrs_to_pay` double NOT NULL,
  `interest_rate` double NOT NULL,
  `monthly_payment` double NOT NULL,
  `num_of_payments` double NOT NULL,
  `total_payment` double NOT NULL,
  `loan_purpose` varchar(50) NOT NULL,
  `created_on` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loan_table`
--

INSERT INTO `loan_table` (`id`, `student_id`, `amount`, `num_of_yrs_to_pay`, `interest_rate`, `monthly_payment`, `num_of_payments`, `total_payment`, `loan_purpose`, `created_on`) VALUES
(2, '12-09876', 1000, 1, 0.005, 100, 132465, 64512, 'serdfghjb', '2024-05-19 12:49:01'),
(3, '03024', 10000, 3, 0.005, 304.21937451555715, 36, 10951.897482560058, 'Gadget/s for School,', '2024-05-19 12:49:01'),
(4, 'h224', 5000, 3, 0.005, 152.10968725777857, 36, 5475.948741280029, 'Tuition Fee,', '2024-05-19 12:49:01'),
(5, '123-123', 2000, 1, 0.005, 172.13285941416473, 12, 2065.5943129699767, 'Tuition Fee,', '2024-05-19 12:49:01'),
(1000, '122-49762', 4000, 2, 0.005, 177.28244101103115, 24, 4254.778584264748, 'Allowance,', '2024-05-19 12:49:01'),
(1001, '231-09876', 4000, 3, 0.005, 121.68774980622287, 36, 4380.758993024023, 'Allowance,', '2024-05-19 12:49:01'),
(1002, '123-82345', 5000, 2, 0.005, 221.60305126378893, 24, 5318.473230330934, 'Tuition Fee', '2024-05-19 13:17:45'),
(1003, '232-98673', 1000, 0.5, 0.005, 169.59545564411036, 6, 1017.5727338646622, 'Allowance', '2024-05-19 13:23:59'),
(1004, '125-658963', 10000, 2, 0.005, 443.20610252757785, 24, 10636.946460661868, 'Allowance', '2024-05-19 17:20:27'),
(1005, '123-12332', 2000, 2, 0.005, 88.64122050551558, 24, 2127.389292132374, 'Tuition Fee', '2024-05-19 18:45:21');

-- --------------------------------------------------------

--
-- Table structure for table `student_table`
--

CREATE TABLE `student_table` (
  `id` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `middle_name` varchar(50) NOT NULL,
  `suffix` varchar(50) NOT NULL,
  `birthdate` varchar(10) NOT NULL DEFAULT '',
  `gender` varchar(50) NOT NULL,
  `phone_number` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `nationality` varchar(50) NOT NULL,
  `civil_status` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `zip_code` int(11) NOT NULL,
  `guardian_fullname` varchar(50) NOT NULL,
  `guardian_relationship` varchar(50) NOT NULL,
  `guardian_contact_number` varchar(50) NOT NULL,
  `is_active` bit(1) NOT NULL DEFAULT b'1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_table`
--

INSERT INTO `student_table` (`id`, `last_name`, `first_name`, `middle_name`, `suffix`, `birthdate`, `gender`, `phone_number`, `email`, `nationality`, `civil_status`, `address`, `zip_code`, `guardian_fullname`, `guardian_relationship`, `guardian_contact_number`, `is_active`) VALUES
('03024', 'Cierel', 'Autida', 'A', 'None', '2020-04-18', 'Female', '0999505528', 'cirelautida@gmail.com', 'Filipino', 'Single', 'Looc, Ouano Mandaue City', 6014, '', '', '', b'1'),
('12-09876', 'James', 'Damaso', 'N', 'None', '2003-05-03', 'Male', '09236541205', 'damaso@gmail.com', 'Filipino', 'Single', 'Mandaue', 6014, '', '', '', b'1'),
('121-09876', 'Erica', 'Manatad', 'A.', 'None', '2002-09-12', 'Female', '09995646465', 'erica@gmail.com', 'Filipino', 'Single', 'Looc, Mandaue', 6014, '', '', '', b'1'),
('122-09833', 'James', 'Damaso', 'N', 'None', '2003-03-05', 'Male', '095612489630', 'panwel@gmail.com', 'Filipino', 'Single', 'Mandaue', 6014, '', '', '', b'1'),
('122-09876', 'James', 'Damaso', 'N', 'None', '2003-05-03', 'Male', '09185632410', 'dmaos@gmail.com', 'Filipino', 'Single', 'Mandaue', 6014, '', '', '', b'1'),
('122-49762', 'Edwin', 'Manatad', 'A.', 'Jr.', '2005-09-01', 'Male', '029301547853', 'edwinmanatad@gmail.com', 'Filipino', 'Single', 'Cambaro, Mandaue City', 6014, 'Elsie A. Manatad', 'Mother', '09302412055', b'1'),
('123-123', 'Elyric', 'Manatad', 'A.', 'None', '1995-05-15', 'Male', '029652315489', 'elyric@gmail.com', 'Filipino', 'Single', 'Cebu', 6014, 'Edwin Manatad', 'Father', '0995050027', b'1'),
('123-12332', 'Sharalyn', 'Dequit', '', 'None', '2002-05-05', 'Female', '09235146565', 'shara@gmail.com', 'Filipino', 'Single', 'Mandaue City', 6014, 'Shara\'s Mommy', 'Mother', '092156348596', b'1'),
('123-1298', 'Gian Carlo', 'Delfino', 'Z', 'Jr.', '2002-08-03', 'Male', '0932145865', 'giancarlodelf@gmail.com', 'Filipino', 'Single', 'Labogon, mandaue City', 6014, '', '', '', b'1'),
('123-82345', 'Christine Mae', 'Flores', 'L.', 'None', '2002-07-19', 'Female', '09302564850', 'floresitin@gmail.com', 'Filipino', 'Single', 'Borbon,  Cebu', 5026, 'Analy Flores', 'Mother', '09565656554', b'1'),
('123-98765', 'Lemalyn', 'Delos Santos', 'S', 'None', '2001-02-08', 'Rather not say', '09565656565', 'malyn@gmail.com', 'Filipino', 'Single', 'Paknaan, Mandaue CIty', 6014, '', '', '', b'1'),
('123-9877', 'Jannel', 'Gallofin', 'E.', 'None', '2003-08-13', 'Female', '09652314569', 'gallofin.jannel.mcc@gmail.com', 'Filipino', 'Single', 'Consolacion', 6013, '', '', '', b'1'),
('125-658963', 'Edwin', 'Manatad', 'O.', 'Sr.', '1976-04-09', 'Male', '09995050027', 'edwinmanatad@gmail.com', 'Fiilipino', 'Single', 'Looc, Mandaue City', 6014, 'Flaviano Manatad', 'Father', '09652314785', b'1'),
('231-09876', 'Merry Cony', 'Manatad', 'A.', 'None', '1999-12-08', 'Female', '095644645', 'manatad@gmail.com1', 'Filipino', 'Single', 'Tisa Labangon', 4566, 'Edwin Manatad', 'Father', '09994544000', b'1'),
('232-37873', 'Mildred', 'Ico', '', 'None', '2002-02-20', 'Female', '09995647120', 'icomildred@gmail.com', 'Filipino', 'Single', 'Cubacub, Mandaue City', 6014, '', '', '', b'1'),
('232-98673', 'Krystel Kate', 'Ostria', '', 'None', '2002-04-25', 'Female', '2343578899098', 'kate@gmail.com', 'Filipino', 'Single', 'Looc Paradise, Mandaue City', 6014, 'Sample Parent Name', 'Guardian', '09565656565', b'1'),
('h224', 'hhhhhhhhh', 'hhhh', 'h', 'None', '2002-02-02', 'Male', '34242', 'asdfasdf', 'asdf', 'Single', 'asdf2', 3423, 'asdfasdf', 'asdffasdfsdf', 'asf345344', b'1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_table`
--
ALTER TABLE `admin_table`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `education_table`
--
ALTER TABLE `education_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_education_table` (`student_id`);

--
-- Indexes for table `guardians`
--
ALTER TABLE `guardians`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_guardians` (`student_id`);

--
-- Indexes for table `loan_table`
--
ALTER TABLE `loan_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_student_id` (`student_id`);

--
-- Indexes for table `student_table`
--
ALTER TABLE `student_table`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_table`
--
ALTER TABLE `admin_table`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `education_table`
--
ALTER TABLE `education_table`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `guardians`
--
ALTER TABLE `guardians`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `loan_table`
--
ALTER TABLE `loan_table`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1006;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `education_table`
--
ALTER TABLE `education_table`
  ADD CONSTRAINT `fk_education_table` FOREIGN KEY (`student_id`) REFERENCES `student_table` (`id`);

--
-- Constraints for table `guardians`
--
ALTER TABLE `guardians`
  ADD CONSTRAINT `fk_guardians` FOREIGN KEY (`student_id`) REFERENCES `student_table` (`id`);

--
-- Constraints for table `loan_table`
--
ALTER TABLE `loan_table`
  ADD CONSTRAINT `fk_student_id` FOREIGN KEY (`student_id`) REFERENCES `student_table` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
