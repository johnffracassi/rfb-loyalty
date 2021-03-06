import {LOCALE_ID, NgModule} from '@angular/core';
import {Title} from '@angular/platform-browser';
import {registerLocaleData} from '@angular/common';
import locale from '@angular/common/locales/en';

import {JhiAlertComponent, JhiAlertErrorComponent, RfbloyaltySharedLibsModule} from './';

@NgModule({
    imports: [
        RfbloyaltySharedLibsModule
    ],
    declarations: [
        JhiAlertComponent,
        JhiAlertErrorComponent
    ],
    providers: [
        Title,
        {
            provide: LOCALE_ID,
            useValue: 'en'
        },
    ],
    exports: [
        RfbloyaltySharedLibsModule,
        JhiAlertComponent,
        JhiAlertErrorComponent
    ]
})
export class RfbloyaltySharedCommonModule {
    constructor() {
        registerLocaleData(locale);
    }
}
