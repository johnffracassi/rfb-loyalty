import {Component, OnInit} from '@angular/core';
import {NgbModalRef} from '@ng-bootstrap/ng-bootstrap';
import {JhiEventManager} from 'ng-jhipster';

import {Account, LoginModalService, Principal} from '../shared';
import {RfbLocation, RfbLocationService} from '../entities/rfb-location';
import {RfbEventService} from '../entities/rfb-event';
import {HttpResponse} from '@angular/common/http';

@Component({
    selector: 'jhi-home',
    templateUrl: './home.component.html',
    styleUrls: [
        'home.css'
    ]

})
export class HomeComponent implements OnInit {
    account: Account;
    modalRef: NgbModalRef;
    isSaving: boolean;
    locations: RfbLocation[];

    constructor(
        private principal: Principal,
        private loginModalService: LoginModalService,
        private eventManager: JhiEventManager,
        private locationService: RfbLocationService,
        private eventService: RfbEventService
    ) {
    }

    ngOnInit() {
        this.principal.identity().then((account) => {
            this.account = account;
        });
        this.registerAuthenticationSuccess();
        this.loadLocations();
    }

    registerAuthenticationSuccess() {
        this.eventManager.subscribe('authenticationSuccess', (message) => {
            this.principal.identity().then((account) => {
                this.account = account;
            });
        });
    }

    isAuthenticated() {
        return this.principal.isAuthenticated();
    }

    login() {
        this.modalRef = this.loginModalService.open();
    }

    loadLocations() {
        this.locationService.query({
            page: 0,
            size: 100,
            sort: ['locationName', 'ASC']}).subscribe(
            (res: HttpResponse<RfbLocation[]>) => {
                this.locations = res.body;
            },
            (res: HttpResponse<RfbLocation[]>) => { console.log(res.body); }
        );
    }

    checkIn() {
        console.log('check-in runner');
        // get selected location
        // get today's date
        // get event code
        // :: call event service and look for an event where those 3 items match
        // :: if you find a match log an eventAttendance for this user (this.account) and that event
        console.log(this.account);
    }

    clear() {}

    setHomeLocation() {}
}
