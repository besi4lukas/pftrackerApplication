-- users table
-- this table contains all the users using pf tracker
CREATE TABLE public.users (
    userId SERIAL PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    passcode VARCHAR(255) NOT NULL,
    role VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT current_timestamp,
    updated_at TIMESTAMP NOT NULL DEFAULT current_timestamp
);

INSERT INTO public.users(email, passcode, role, created_at, updated_at) VALUES ('kb@example.com', 123456, 'admin', NOW(), NOW());

-- budgets table
-- this table contains all the users budget
CREATE TABLE public.budgets (
    budgetId SERIAL PRIMARY KEY, -- Auto-incrementing ID
    userId INTEGER NOT NULL,
    budgetType VARCHAR(255) NOT NULL,
    budgetData JSONB,
    created_at TIMESTAMP NOT NULL DEFAULT current_timestamp,
    updated_at TIMESTAMP NOT NULL DEFAULT current_timestamp
);

INSERT INTO public.budgets(userId, budgetType, budgetData, created_at, updated_at) VALUES (1, 'ZERO_SCHEME', '{"tasks": { "groceries": { "value": 200}, "gas": { "value": 60} } }', NOW(), NOW());
