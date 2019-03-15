import { NgModule } from '@angular/core';

import { FettlePathSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [FettlePathSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [FettlePathSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class FettlePathSharedCommonModule {}
