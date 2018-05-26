import {BaseEntity, User} from './../../shared';
import {RfbEvent} from '../rfb-event/rfb-event.model';

export class RfbEventAttendance implements BaseEntity {
    constructor(
        public id?: number,
        public attendanceDate?: any,
        public rfbEventDTO?: RfbEvent,
        public userDTO?: User
    ) {
    }
}
