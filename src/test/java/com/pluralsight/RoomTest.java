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
    // checkIn() on a dirty room does nothing (it stays not occupied)
    @Test
    public void checkIn_should_onDirtyRoomDoesNothing(){
        Room room = new Room(1, 200, true, true);
        boolean actualResult = room.checkIn();
        assertEquals(false, actualResult);
    }
    //checkIn() on an occupied room does nothing. check it stays not dirty.
    @Test
    public void checkIn_should_onOccupiedRoomDoesNothingNotDirty(){
        Room room = new Room(2, 124.00, true, false);
        boolean actualResult = room.checkIn();
        assertEquals(false, actualResult);
    }
    //cleanRoom() on an occupied room does nothing (it stays dirty
    @Test
    public void cleanRoom_should_onOccupiedRoomDoesNothing(){
        Room room = new Room(2, 200, true, false);
        boolean actualCleanRoom = room.cleanRoom();
        assertEquals(false, actualCleanRoom);
    }
}