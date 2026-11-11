package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_changeRoomOccupiedAndDirty(){
        //Arrange
        Room room = new Room(1,200,false,false);
        //Act
        room.checkIn();
        //Assert(verify)
        //expected then actual
        assertEquals(true, room.isOccupied());
        assertEquals(true, room.isDirty());
    }
    @Test
//    checkOut() leaves the room not occupied, still dirty, and not available
    public void checkOut_should_leaveRoomNotOccupiedStillDirtyAndNotAvailable(){
        Room room2 = new Room(1, 125, false, true);
        room2.checkOut();
        assertEquals(false, room2.isOccupied());
        assertEquals(true, room2.isDirty());
        assertEquals(false, room2.isAvailable());
    }

}