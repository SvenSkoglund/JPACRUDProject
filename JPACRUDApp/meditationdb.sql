-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema meditationdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `meditationdb` ;

-- -----------------------------------------------------
-- Schema meditationdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `meditationdb` DEFAULT CHARACTER SET utf8 ;
USE `meditationdb` ;

-- -----------------------------------------------------
-- Table `meditationdb`.`center`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `meditationdb`.`center` ;

CREATE TABLE IF NOT EXISTS `meditationdb`.`center` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(10000) NULL,
  `tradition` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `state` VARCHAR(45) NULL,
  `country` VARCHAR(45) NULL,
  `postal_code` VARCHAR(45) NULL,
  `map` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `meditationdb`.`teacher`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `meditationdb`.`teacher` ;

CREATE TABLE IF NOT EXISTS `meditationdb`.`teacher` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `tradition` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `meditationdb`.`book`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `meditationdb`.`book` ;

CREATE TABLE IF NOT EXISTS `meditationdb`.`book` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `author_first_name` VARCHAR(45) NULL,
  `author_last_name` VARCHAR(45) NULL,
  `title` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `release_year` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
GRANT USAGE ON *.* TO meditationuser;
 DROP USER meditationuser;
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
CREATE USER 'meditationuser' IDENTIFIED BY 'silasamadhipanna';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE `meditationdb`.* TO 'meditationuser';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
