package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_changeRoomOccupiedAndDirty(){
        //Arrange
        Room room = new Room(1, 200, false, false);
        //Act
        room.checkIn();
        //Assert(verify)
        //expected then actual
        assertEquals(true, room.isOccupied());
        assertEquals(true, room.isDirty());
    }
    // checkOut() leaves the room not occupied, still dirty, and not available
    @Test
    public void checkOut_should_leaveRoomNotOccupiedStillDirtyAndNotAvailable(){
        Room room2 = new Room(1, 125, false, true);
        room2.checkOut();
        assertEquals(false, room2.isOccupied());
        assertEquals(true, room2.isDirty());
        assertEquals(false, room2.isAvailable());
    }
    //cleanRoom() on an empty, dirty room makes it available
    @Test
    public void cleanRoom_should_onEmptyDirtyRoomMakesAvailable(){
        Room room3 = new Room(2, 285, true, false);
        room3.cleanRoom();
        assertEquals(false, room3.isDirty());
        assertEquals(true, room3.isOccupied());
    }
}