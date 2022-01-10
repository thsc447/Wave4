SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `movies_w4` DEFAULT CHARACTER SET utf8 ;
USE `movies_w4` ;

-- -----------------------------------------------------
-- Table `movies_w4`.`nationalities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movies_w4`.`nationalities` (
                                                           `idnationalities` INT NOT NULL,
                                                           `name` VARCHAR(45) NULL,
    PRIMARY KEY (`idnationalities`),
    UNIQUE INDEX `idnationalities_UNIQUE` (`idnationalities` ASC) VISIBLE)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `movies_w4`.`title`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movies_w4`.`title` (
                                                   `idtitle` INT NOT NULL AUTO_INCREMENT,
                                                   `name` VARCHAR(100) NOT NULL,
    `release` TINYINT NOT NULL,
    `nationality` VARCHAR(100) NOT NULL,
    `director` VARCHAR(100) NOT NULL,
    `studio` VARCHAR(100) NOT NULL,
    `nationalities_idnationalities` INT NOT NULL,
    PRIMARY KEY (`idtitle`, `nationalities_idnationalities`),
    UNIQUE INDEX `idtitle_UNIQUE` (`idtitle` ASC) VISIBLE,
    INDEX `fk_title_nationalities_idx` (`nationalities_idnationalities` ASC) VISIBLE,
    CONSTRAINT `fk_title_nationalities`
    FOREIGN KEY (`nationalities_idnationalities`)
    REFERENCES `movies_w4`.`nationalities` (`idnationalities`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `movies_w4`.`directors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movies_w4`.`directors` (
                                                       `idtable1` INT NOT NULL,
                                                       `name` VARCHAR(100) NULL,
    `title_idtitle` INT NOT NULL,
    `title_nationalities_idnationalities` INT NOT NULL,
    PRIMARY KEY (`idtable1`, `title_idtitle`, `title_nationalities_idnationalities`),
    UNIQUE INDEX `idtable1_UNIQUE` (`idtable1` ASC) VISIBLE,
    INDEX `fk_directors_title1_idx` (`title_idtitle` ASC, `title_nationalities_idnationalities` ASC) VISIBLE,
    CONSTRAINT `fk_directors_title1`
    FOREIGN KEY (`title_idtitle` , `title_nationalities_idnationalities`)
    REFERENCES `movies_w4`.`title` (`idtitle` , `nationalities_idnationalities`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `movies_w4`.`actors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movies_w4`.`actors` (
                                                    `idactors` INT NOT NULL,
                                                    `name` VARCHAR(100) BINARY NULL,
    UNIQUE INDEX `idactors_UNIQUE` (`idactors` ASC) VISIBLE,
    PRIMARY KEY (`idactors`))
    ENGINE = InnoDB
    PACK_KEYS = Default
    ROW_FORMAT = Default;


-- -----------------------------------------------------
-- Table `movies_w4`.`title_has_actors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `movies_w4`.`title_has_actors` (
                                                              `title_idtitle` INT NOT NULL,
                                                              `title_nationalities_idnationalities` INT NOT NULL,
                                                              `actors_idactors` INT NOT NULL,
                                                              PRIMARY KEY (`title_idtitle`, `title_nationalities_idnationalities`, `actors_idactors`),
    INDEX `fk_title_has_actors_actors1_idx` (`actors_idactors` ASC) VISIBLE,
    INDEX `fk_title_has_actors_title1_idx` (`title_idtitle` ASC, `title_nationalities_idnationalities` ASC) VISIBLE,
    CONSTRAINT `fk_title_has_actors_title1`
    FOREIGN KEY (`title_idtitle` , `title_nationalities_idnationalities`)
    REFERENCES `movies_w4`.`title` (`idtitle` , `nationalities_idnationalities`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT `fk_title_has_actors_actors1`
    FOREIGN KEY (`actors_idactors`)
    REFERENCES `movies_w4`.`actors` (`idactors`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
    ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
