import { NgModule } from '@angular/core';

import { MonobankSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [MonobankSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [MonobankSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class MonobankSharedCommonModule {}
