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
  `description` VARCHAR(10000) NULL,
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
  `description` VARCHAR(10000) NULL,
  `release_year` INT NULL,
  `cover_url` VARCHAR(1000) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
GRANT USAGE ON *.* TO meditationuser@localhost;
 DROP USER meditationuser@localhost;
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
CREATE USER 'meditationuser'@'localhost' IDENTIFIED BY 'azsxdcfvgbhnjm';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE `meditationdb`.* TO 'meditationuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `meditationdb`.`center`
-- -----------------------------------------------------
START TRANSACTION;
USE `meditationdb`;
INSERT INTO `meditationdb`.`center` (`id`, `name`, `description`, `tradition`, `address`, `city`, `state`, `country`, `postal_code`, `map`) VALUES (1, 'Panditarama Yangon', 'The Panditarama Shwe Taung Gon Sasana Yeiktha is a center for the practice and study of the Theravada Buddhist teachings. Established in October 1990 by the Venerable Guiding Teacher U Panditabhivamsa, it follows the great lineage of the late Venerable Mahasi Sayadaw. He no longer gives personal interviews during retreats, but still offers Dhamma talks, and closely supervises other Sayadaws who interview.', 'Theravadan Buddhism', 'No. 80 (A), Thanlwin Rd', 'Yangon', 'Baghan', 'Myanmar (Burma)', '11201', '<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15276.982760671715!2d96.1469225!3d16.8141633!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xd36347ac4e14ec6a!2sPandit%C4%83r%C4%83ma+Shwe+Taung+Gone+S%C4%83sana+Meditation+Centre!5e0!3m2!1sen!2sus!4v1524188659791\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>');
INSERT INTO `meditationdb`.`center` (`id`, `name`, `description`, `tradition`, `address`, `city`, `state`, `country`, `postal_code`, `map`) VALUES (2, 'Tathagata Meditation Center', 'With enlightenment as the ultimate goal in life, the Vipassana Meditation Group was formed under the spiritual guidance of the late Venerable U Silananda in 1987. The group progressed until 1991 when it founded Tathagata Meditation Center (TMC). TMC is located on more than 2.5 acres in San Jose, California. The facilities consist of a Sangha quarters for monks, a meditation hall, separate men and women’s quarters, and a kitchen and a dining area.The late Venerable U Silananda Sayadaw was the Chief Meditation Teacher of the Center and Venerable U Thuzana Sayadaw is the Abbot. The Advisory Sangha for TMC are Venerable U Pandita Sayadaw, Venerable Khippa Panno Sayadaw and Beelin Sayadaw.', 'Theravadan Buddhism', '1215 Lucretia Ave', 'San Jose', 'CA', 'United States', '95122', '<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12690.393349805645!2d-121.8561807!3d37.328341!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x56d633d532cd4a9e!2sTathagata+Meditation+Center!5e0!3m2!1sen!2sus!4v1524188861061\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>');
INSERT INTO `meditationdb`.`center` (`id`, `name`, `description`, `tradition`, `address`, `city`, `state`, `country`, `postal_code`, `map`) VALUES (3, 'Shambhala Mountain Center', 'The Shambhala Mountain Center was founded by Vidyadhara Chögyam Trungpa Rinpoche in 1971 at Red Feather Lakes, Colorado(40°44′N 105°32.5′W). Trungpa arrived in Boulder, Colorado in 1970 with a number of students from Tail of the Tiger in Barnet, Vermont, now known as Karmê Chöling. Immedediately students appeared from the neighboring towns and came from all parts of the country to become part of the Karma Dzong Meditation Center in Boulder. Among these were the members of a commune called the Pigmy Farm, located on the eastern edge of the city. In early 1971 a student of Trungpa Rinpoche, Jonathan Eric, inherited $100,000 from an uncle. He gave the money to Trungpa and Karma Dzong, and it was used to purchase what became the Rocky Mountain Dharma Center (now called Shambhala Mountain Center), as well as Tail of the Tiger in Barnet, Vermont (now called Karme Chöling). The Pigmies and others were the original inhabitants. The property is nestled on 600 acres (2.4 km²) of grassy fields, forest, ponds, and streams. The center boasts 35,000 square feet (3,300 m2) of building space for meditation, dharma talks, programs, and lodging. The center hosts regular Shambhala Training programs as well as yoga instruction, leadership training, children\'s programs, and longer retreats. Following the death of Trungpa in 1987, his followers began a fourteen-year process of building a stupa at the Shambhala Mountain Center. Completed in August 2001, The Great Stupa of Dharmakaya reaches 108 feet (33 m) and is open to visitors daily.\n\n\n\n', 'Shambhala Buddhism', '151 Shambhala Way', 'Red Feather Lakes', 'CO', 'United States', '80545', '<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12092.847277956573!2d-105.5413466!3d40.7353644!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xe3c995215a9cc7fc!2sShambhala+Mountain+Center!5e0!3m2!1sen!2sus!4v1524189142019\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>');
INSERT INTO `meditationdb`.`center` (`id`, `name`, `description`, `tradition`, `address`, `city`, `state`, `country`, `postal_code`, `map`) VALUES (4, 'Dhamma Visuddhi', 'One of more than 160 centers worldwide where the technique of Vipassana meditation is taught and practiced, Dhamma Visuddhi is situated on 15 acres of forested property on the bluffs overlooking the Red Cedar river and the town of Menomonie, Wisconsin. The site is within the city limits, and yet very quiet and secluded. Dhamma Visuddhi, a name that means ‘Purity of Dhamma’, is a little more than one hour east of the Minneapolis/ Saint Paul airport in a traditional dairy farming area of western Wisconsin, and is easily reached by regularly scheduled public transportation.', 'Theravadan Buddhism', '500 Meadow Hill Dr', 'Menomonie', 'WI', 'United States', '54751', '<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d11307.645557411252!2d-91.9331135!3d44.8844522!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xd30ab29818cb495c!2sDhamma+Visuddhi!5e0!3m2!1sen!2sus!4v1524190747528\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>');
INSERT INTO `meditationdb`.`center` (`id`, `name`, `description`, `tradition`, `address`, `city`, `state`, `country`, `postal_code`, `map`) VALUES (5, 'Panditarama Lumbini', 'Panditarama Lumbini International Vipassana Meditation Center is located in Lumbini, the birthplace of the Buddha and one of the four main places of pilgrimage for Buddhists. Lumbini is an international project including re-developing the ancient sites and constructing countless new monasteries. It is located in southern Nepal, near the Indian border. Panditarama Lumbini International Vipassana Meditation Center was set up by Ven. Sayadaw U Panditabhivamsa of Myanmar in cooperation with the Venerable Sayadaw U Asabhacara and inaugurated on February 7, 1999. Panditarama Lumbini offers a supportive, comfortable and peaceful setting for dhamma-students seeking practice. The meditation method is Intensive Vipassana in the tradition of the Venerable Mahasi Sayadaw of Myanmar, which consists of sitting meditation and formal walking meditation throughout the day. Almost daily interviews and regular Dhamma-talks in English are offered. Meditators observe Noble Silence and keep eight precepts. Panditarama Lumbini offers an ongoing retreat year-round. Meditators may schedule their individual retreat from a minimum of seven days up to several months starting at any time of the year. The resident teacher, Venerable Vivekananda, has trained with the Venerable Sayadaw U Panditabhivamsa of Myanmar since 1988. Venerable Vivekananda teaches meditation in English, Burmese, German and French. The resident teacher, Venerable Sayalay Daw Bhaddamanika, has trained under the Venerable Sayadaw U Panditabhivamsa of Burma for many years. Since the winter season of 2000, Sayalay Daw Bhaddamanika has joined interviewing meditators on six days a week and gives regular Dhamma-talks in English. Panditarama Lumbini is keeping the old tradition of Dana and has operated from its very beginning entirely on the principle of generosity. There are no set daily fees and monetary donations are used to maintain and further develop the meditation center for the benefit of present and future meditators. If you plan a retreat at the center please read carefully the guidelines for meditators and contact Panditarama to schedule your arrival and duration of stay.', 'Theravadan Buddhism', 'Vishnupura Rd', 'Lumbini', 'Sanskritik', 'Nepal', '32900', '<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d14159.1842037502!2d83.2747364!3d27.4756081!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xe29ee47ba5c7d156!2sPanditarama+Lumbini+Vipassana+Meditation+Center!5e0!3m2!1sen!2sus!4v1524190645045\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>');

COMMIT;


-- -----------------------------------------------------
-- Data for table `meditationdb`.`teacher`
-- -----------------------------------------------------
START TRANSACTION;
USE `meditationdb`;
INSERT INTO `meditationdb`.`teacher` (`id`, `first_name`, `last_name`, `tradition`, `description`) VALUES (1, 'Daniel', 'Ingram', 'Theravadan Budhhism', 'Daniel is an extroverted Gen X intellectual. He is known for his pronounced enthusiasm, lip-flapping, grandiosity, eccentricity, and calling people on their stuff and shadow sides regardless of whether or not this is helpful or even accurate. He is an arahat and has a solid mastery of the basic concentration states from the first jhana to Nirodha Samapatti, including the Pure Land Jhanas. He also has a solid knowledge of Buddhist theory and the texts, and because of these three areas of expertise considers himself a qualified teacher. He was also authorized and encouraged to teach by a lineaged abbot of the Mahasi Sayadaw tradition. When it comes to insight practices, he has standards so high, exacting, and uncompromising that only those who are dedicated practitioners are likely to find them helpful. On the other hand, he is a firm believer that if people simply practice the basic techniques recommended by the Buddha they can be very successful and awakened meditators. He is one of the rare teachers who will talk about insight directly and answer nearly any question about dharma practice without using code, covering things up or watering things down. Daniel is a diehard Mahasi Sayadaw fan, though he is very happy whenever he sees people trying to master any of the world’s great mystical traditions and thus considers himself a pan-mystical evangelist. He is also a chronic map-monger and technique freak because he has had them work very well for him. He does not claim to have any special knowledge of how to live skillfully in the conventional world, but has found that a positive attitude, non-pretentious kindness, and a sense of humor will take you a long way. If you imagine that you want to bust out some hardcore practice but are in fact just looking for a daddy, shrink, social worker, or someone to help you prop up your self-esteem, Daniel is unlikely at this stage in his development to be the best person to help you meet your needs. He considers himself to be one badass Dharma Cowboy and prefers similar company or at least those who aspire to be so.');
INSERT INTO `meditationdb`.`teacher` (`id`, `first_name`, `last_name`, `tradition`, `description`) VALUES (2, 'Mahasi', 'Sayadaw', 'Theravadan Budhhism', 'Mahasi Sayadaw U Sobhana (Burmese: မဟာစည်ဆရာတော် ဦးသောဘန, pronounced [məhàsì sʰəjàdɔ̀ ʔú θɔ́bəna̰]; 29 July 1904 – 14 August 1982) was a Burmese Theravada Buddhist monk and meditation master who had a significant impact on the teaching of Vipassana (Insight) meditation in the West and throughout Asia. In his style of practice, derived from the so-called \"New Burmese Method\" of U Nārada, the meditator anchors their attention on the sensations of the rising and falling of the abdomen during breathing, observing carefully any other sensations or thoughts.');
INSERT INTO `meditationdb`.`teacher` (`id`, `first_name`, `last_name`, `tradition`, `description`) VALUES (3, 'Trungpa', 'Rinpoche', 'Tibetan/Shambhala Buddhism', 'Chögyam Trungpa (Wylie: Chos rgyam Drung pa; March 5, 1939 – April 4, 1987) was a Buddhist meditation master and holder of both the Kagyu and Nyingma lineages, the eleventh Trungpa tülku, a tertön, supreme abbot of the Surmang monasteries, scholar, teacher, poet, artist, and originator of a radical re-presentation of Shambhala vision. Recognized both by Tibetan Buddhists and by other spiritual practitioners and scholars[1][2] as a preeminent teacher of Tibetan Buddhism, he was a major figure in the dissemination of Tibetan Buddhism to the West,[3] founding Vajradhatu and Naropa University and establishing the Shambhala Training method. Among his contributions are the translation of numerous Tibetan texts,[4] the introduction of the Vajrayana teachings to the West, and a presentation of the Buddhadharma largely devoid of ethnic trappings. Trungpa coined the term crazy wisdom.[5] Some of his teaching methods and actions were the topic of controversy during his lifetime and afterwards.');
INSERT INTO `meditationdb`.`teacher` (`id`, `first_name`, `last_name`, `tradition`, `description`) VALUES (4, 'Sharon', 'Salzberg', 'Multiple Traditions', 'Born in New York City in 1952, Sharon Salzberg experienced a childhood involving considerable loss and turmoil. An early realization of the power of meditation to overcome personal suffering determined her life direction. Her teaching and writing now communicates that power to a worldwide audience of practitioners. She offers non-sectarian retreat and study opportunities for participants from widely diverse backgrounds. Sharon first encountered Buddhism in 1969, in an Asian philosophy course at the State University of New York, Buffalo. The course sparked an interest that, in 1970, took her to India, for an independent study program. Sharon traveled motivated by “an intuition that the methods of meditation would bring me some clarity and peace.” In 1971, in Bodh Gaya, India, Sharon attended her first intensive meditation course. She spent the next years engaged in intensive study with highly respected meditation teachers.');
INSERT INTO `meditationdb`.`teacher` (`id`, `first_name`, `last_name`, `tradition`, `description`) VALUES (5, 'Adam', 'Mizner', 'Yang Style Taiji', 'Sifu Adam Mizner practices and embodies the internal arts of Taijiquan (Tai Chi Chuan), Nei Gong and meditation, he teaches Yang Style Taijiquan in the tradition of Huang Sheng Shyan and Yang Shao Hou.');

COMMIT;


-- -----------------------------------------------------
-- Data for table `meditationdb`.`book`
-- -----------------------------------------------------
START TRANSACTION;
USE `meditationdb`;
INSERT INTO `meditationdb`.`book` (`id`, `author_first_name`, `author_last_name`, `title`, `description`, `release_year`, `cover_url`) VALUES (1, 'Daniel', 'Ingram', 'Mastering the Core Teachings of the Buddha', 'Nearly all of my earlier writings have been compiled, edited, expanded and integrated into a work calledMastering the Core Teachings of the Buddha, An Unusually Hardcore Dharma Book. I think it is one of the more practical and technically detailed manuals for high-level insight and concentration practice available, and its maps of spiritual terrain and advice for navigating in unusual territory are world-class. It is available in Adobe (.pdf) format for download below and is about 1.4 megabytes. When printed, the book is about 392 pages. In 2007 and 2008 I rewrote a substantial portion of the chapter on the Models of the Stages of Enlightenment.', 2008, NULL);
INSERT INTO `meditationdb`.`book` (`id`, `author_first_name`, `author_last_name`, `title`, `description`, `release_year`, `cover_url`) VALUES (2, 'Mahasi', 'Sayadaw', 'Manual of Insight', 'Manual of Insight is the magnum opus of Mahasi Sayadaw, one of the originators of the “vipassana movement” that has swept through the Buddhist world over the last hundred years. The manual presents a comprehensive overview of the practice of insight meditation, including the foundational aspects of ethical self-discipline, understanding the philosophical framework for the practice, and developing basic concentration and mindfulness. It culminates with an in-depth exploration of the various types of insight and spiritual fruits that the practice yields.', 2016, NULL);
INSERT INTO `meditationdb`.`book` (`id`, `author_first_name`, `author_last_name`, `title`, `description`, `release_year`, `cover_url`) VALUES (3, 'Trungpa', 'Rinpoche', 'Smile at Fear', 'Many of us, without even realizing it, are dominated by fear. We might be aware of some of our fears—perhaps we are afraid of public speaking, of financial hardship, or of losing a loved one. Chögyam Trungpa shows us that most of us suffer from a far more pervasive fearfulness: fear of ourselves. We feel ashamed and embarrassed to look at our feelings or acknowledge our styles of thinking and acting; we don’t want to face the reality of our moment-to-moment experience. It is this fear that keeps us trapped in cycles of suffering, despair, and distress.', 2010, NULL);
INSERT INTO `meditationdb`.`book` (`id`, `author_first_name`, `author_last_name`, `title`, `description`, `release_year`, `cover_url`) VALUES (4, 'Sharon', 'Salzberg', 'Lovingkindness', 'Throughout our lives we long to love ourselves more deeply and find a greater sense of connection with others. Our fear of intimacy–both with others and with ourselves–creates feelings of pain and longing. But these feelings can awaken in us the desire for freedom and the willingness to take up the spiritual path. In this inspiring book, Sharon shows us how the Buddhist path of lovingkindness can help us discover the radiant, joyful heart within each of us. This practice of lovingkindness is revolutionary because it has the power to radically change our lives, helping us cultivate true happiness in ourselves and genuine compassion for others. The author draws on simple Buddhist teachings, wisdom stories from various traditions, guided meditation practices, and her own experience from twenty-five years of practice and teaching to illustrate how each one of us can cultivate love, compassion, joy, and equanimity.', 1995, NULL);

COMMIT;
