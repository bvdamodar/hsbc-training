import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpIdlistComponent } from './emp-idlist.component';

describe('EmpIdlistComponent', () => {
  let component: EmpIdlistComponent;
  let fixture: ComponentFixture<EmpIdlistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmpIdlistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmpIdlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
