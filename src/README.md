------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Artists/ Bands and their UK Number One Hits
PURPOSE OF PROJECT: To list all artists and bands who have had UK number one singles
and to list those singles.
VERSION or DATE: 18.04.20
HOW TO START THIS PROJECT: Create an instance of NumberOnes and send messages to this instance. Detailed below.
AUTHORS: Lou Pemberton-Roberts (H7671118)

USER INSTRUCTIONS:

==== Create an instance of class and stores data in map ====
NumberOnes record = new NumberOnes();
record.recordData();

==== Test size of map ====
record.artistsMap.size();

==== Print map ====
record.printMap();

==== Print a given artist and their singles ====
record.artistsMap.get("David Bowie");

==== Check if an artist is present in the map or not ====
record.artistsMap.get("David Bowie"); // true and returns artist and songs
record.printMapValue("Muse"); // false and returns message "Muse is not present in the map!"

==== Adds new entry to map ====
Set<String> blur = new TreeSet<String>();
      blur.add("Beetlebum");
      blur.add("Country House");
record.addMapEntry("Blur", blur);

==== Deletes an entry from the map ====
record.deleteEntry("Oasis"); //deletes Oasis from the map

==== Adds a new song to the collection of songs for an artist/band ====
==== (if artist/band already exists). If artist/band doesn't already ====
==== exist, then a message returns to let user know. =====
record.addToValue("Oasis", "Test Song"); //true
record.artistsMap.get("Oasis"); //test method

record.addToValue("Smashing Pumpkins", "Test Song"); //false - returns "Smashing Pumpkins is 
not present in the map!"

==== Deletes a song from the collection of songs for an artist/band ====
==== (if artist/band already exists). If artist/band doesn't already ====
==== exist, then a message returns to let user know. =====
==== Note: run addToValue() above first to test! ====
record.deleteFromValue("Oasis", "Test Song");
record.artistsMap.get("Oasis"); //test method

record.deleteFromValue("Smashing Pumpkins", "Test Song"); //false - returns "Smashing Pumpkins is 
not present in the map!"