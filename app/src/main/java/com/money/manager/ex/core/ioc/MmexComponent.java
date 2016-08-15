/*
 * Copyright (C) 2012-2016 The Android Money Manager Ex Project Team
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.money.manager.ex.core.ioc;

import com.money.manager.ex.datalayer.StockHistoryRepository;
import com.money.manager.ex.datalayer.StockHistoryRepositorySql;
import com.money.manager.ex.datalayer.StockRepositorySql;
import com.money.manager.ex.home.MainActivity;
import com.money.manager.ex.investment.ISecurityPriceUpdater;
import com.money.manager.ex.investment.morningstar.MorningstarPriceUpdater;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Main Dagger 2 Component. Represents the link between the Modules and Injections.
 * Component consumes functionality.
 */

@Singleton
@Component(modules = MmexModule.class)
public interface MmexComponent {
    void inject(MainActivity activity);

    // Custom objects
    void inject(ISecurityPriceUpdater updater);
    void inject(MorningstarPriceUpdater updater);

    // Repositories
    void inject(StockRepositorySql repository);
    void inject(StockHistoryRepositorySql repository);
}
