import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SponsordashboardComponent } from './sponsordashboard.component';

describe('SponsordashboardComponent', () => {
  let component: SponsordashboardComponent;
  let fixture: ComponentFixture<SponsordashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SponsordashboardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SponsordashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
